package com.aranya.mall.tiny.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.redis.RedisService;
import com.aranya.mall.tiny.common.utils.DateFormat;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodStockParam;
import com.aranya.mall.tiny.mapper.takeout.FoodMapper;
import com.aranya.mall.tiny.mbg.mapper.TakeoutFoodsMapper;
import com.aranya.mall.tiny.mbg.model.TakeoutFoods;
import com.aranya.mall.tiny.mbg.model.TakeoutFoodsExample;
import com.aranya.mall.tiny.service.TakeoutFoodService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class TakeoutFoodServiceImpl implements TakeoutFoodService {
    static final Logger logger = LoggerFactory.getLogger(TakeoutFoodServiceImpl.class);
    @Autowired
    private TakeoutFoodService takeoutFoodService;
    @Autowired
    private TakeoutFoodsMapper mapper;

    @Autowired
    private FoodMapper foodMapper;
    @Autowired
    private RedisService redisService;

    @Override
    public CommonPage<TakeoutFoodDto> foodList(Integer pageSize, Integer pageNum, long restaurantId) {
        PageHelper.startPage(pageNum,pageSize);
        TakeoutFoodsExample example = new TakeoutFoodsExample();
        example.createCriteria().andRestaurantIdEqualTo((int) restaurantId).andDeletedAtIsNull();
        example.setOrderByClause("id asc");
        List<TakeoutFoods> foodList = mapper.selectByExample(example);
        PageInfo foodListPage = new PageInfo<>(foodList);
        List<TakeoutFoodDto> foodDtoList = new ArrayList<>();
        for (TakeoutFoods food: foodList){
            TakeoutFoodDto dto = new TakeoutFoodDto();
            BeanUtil.copyProperties(food, dto);
            foodDtoList.add(dto);
        }
        foodListPage.setList(foodDtoList);
        return CommonPage.restPage(foodListPage);
    }

    @Override
    public int updatePosition(TakeoutFoodDto dto) {
        TakeoutFoods food = foodMapper.toDo(dto);
        food.setSort(dto.getSort());
        return mapper.updateByPrimaryKeySelective(food);
    }

    @Override
    public int updateRecommend(long id) {
        TakeoutFoods food = mapper.selectByPrimaryKey(id);
        food.setIsRecommend(1);
        return mapper.updateByPrimaryKeySelective(food);
    }

    @Override
    public int cancelRecommend(long id) {
        TakeoutFoods food = mapper.selectByPrimaryKey(id);
        food.setIsRecommend(0);
        return mapper.updateByPrimaryKeySelective(food);
    }

    @Override
    public int setStockDate(TakeoutFoodStockParam param) {
        logger.info("TakeoutFoodStockParam:"+param);
        logger.info("TakeoutFoodStockParam:"+param);
        logger.info("TakeoutFoodStockParam:"+param);
        String dateStr = DateFormat.dateFormat(param.getDateTime());

        redisService.set("foodStock:"+param.getId()+":stock:"+dateStr,param.getStock(),param.getDateTime().getTime());
        logger.info("设置成功");
        logger.info("设置成功:"+redisService.get("foodStock:"+param.getId()+":stock:"+dateStr));
        return 1;
    }

}
