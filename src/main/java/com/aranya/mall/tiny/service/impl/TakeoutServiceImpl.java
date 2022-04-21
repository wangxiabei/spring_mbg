package com.aranya.mall.tiny.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import com.alibaba.druid.util.StringUtils;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.dao.takeout.TakeoutTagDao;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantQueryParam;
import com.aranya.mall.tiny.mapper.takeout.RestaurantMapper;
import com.aranya.mall.tiny.mbg.mapper.TakeoutRestaurantDeliveryAreasMapper;
import com.aranya.mall.tiny.mbg.mapper.TakeoutRestaurantsMapper;
import com.aranya.mall.tiny.mbg.mapper.TakeoutTagsMapper;
import com.aranya.mall.tiny.mbg.model.*;
import com.aranya.mall.tiny.service.TakeoutRestaurantService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TakeoutServiceImpl implements TakeoutRestaurantService {
    private Logger logger = LoggerFactory.getLogger(TakeoutServiceImpl.class);

    @Autowired
    private TakeoutRestaurantsMapper takeoutRestaurantsMapper;

    @Autowired
    private TakeoutRestaurantDeliveryAreasMapper restaurantDeliveryAreasMapper;

    @Autowired
    private TakeoutTagDao tagDao;
    @Autowired
    private RestaurantMapper coverMapper;



    @Override
    public Map selectById(long id) {
        Map<String,Object>  map = new HashMap();
        TakeoutRestaurants s =  takeoutRestaurantsMapper.selectByPrimaryKey(id);
        //配送地址
        TakeoutRestaurantDeliveryAreasExample example = new TakeoutRestaurantDeliveryAreasExample();
        example.createCriteria().andRestaurantIdEqualTo(Integer.valueOf(s.getId().toString())).andDeletedAtIsNull();
        example.setOrderByClause("address_parent_id asc");
        List<TakeoutRestaurantDeliveryAreas> area = restaurantDeliveryAreasMapper.selectByExample(example);
        //标签
        List<TakeoutTags> tags = tagDao.selectByRestaurantId(id);
        //组装需要的配送地址数据
        List<String> parent_id = new ArrayList<>();
        for (TakeoutRestaurantDeliveryAreas a : area){
            parent_id.add(a.getAddressParentId().toString());
        }
        StringBuffer tag_name = new StringBuffer();
        for (TakeoutTags tag :tags){
            tag_name.append(tag.getName()+".");
        }
        Map dis = new HashMap();
        dis.put("location_wenan",1);
        List<Map<String,Object>> info = new ArrayList<>();

        Map<String,Object> otes = new HashMap<>();
        otes.put("title","场地位置：");
        otes.put("sub_title","阿村食堂");

        Map<String,Object> otes2 = new HashMap<>();
        otes2.put("title","配送时间：");
        otes2.put("sub_title","12:00");

        info.add(otes);
        info.add(otes2);

        map.put("restaurant_type",tag_name);
        map.put("restaurant_id", s.getId());
        map.put("restaurant_name", s.getName());
        map.put("delivery_address_ids",parent_id);
        map.put("location_distances",dis);
        map.put("other_info",info);
        return map;
    }

    @Override
    public CommonPage<TakeoutRestaurantDto> getList(TakeoutRestaurantQueryParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        TakeoutRestaurantsExample example = new TakeoutRestaurantsExample();
        TakeoutRestaurantsExample.Criteria criteria = example.createCriteria();
        criteria.andDeletedAtIsNull();
        if (!StringUtils.isEmpty(param.getName())){
            criteria.andNameLike(param.getName());
        }
        if (param.getId() != 0){
            criteria.andIdEqualTo(param.getId());
        }
        example.setOrderByClause("id asc");
        List<TakeoutRestaurants> list = takeoutRestaurantsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(list);
        List<TakeoutRestaurantDto> dto = new ArrayList<>();
        for (TakeoutRestaurants r : list){
            TakeoutRestaurantDto d = new TakeoutRestaurantDto();
            BeanUtil.copyProperties(r,d);
            dto.add(d);
        }
        pageInfo.setList(dto);
        return CommonPage.restPage(pageInfo);
    }

    @Override
    public TakeoutRestaurantDto getById(long id) {
        TakeoutRestaurants restaurants =  takeoutRestaurantsMapper.selectByPrimaryKey(id);
        return coverMapper.toDto(restaurants);
    }

    @Override
    public int updateRestaurant(TakeoutRestaurantDto dto) {
        TakeoutRestaurants restaurants =  coverMapper.toDo(dto);
        int count = takeoutRestaurantsMapper.updateByPrimaryKeySelective(restaurants);
        return count;
    }

    @Override
    public int addRestaurant(TakeoutRestaurantDto dto) {
        TakeoutRestaurants restaurant = coverMapper.toDo(dto);
        restaurant.setCreatedAt(DateTime.now());
        restaurant.setUpdatedAt(DateTime.now());
        int count = takeoutRestaurantsMapper.insertSelective(restaurant);
        return count;
    }
}
