package com.aranya.mall.tiny.service;

import com.alibaba.fastjson.JSONObject;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDetail;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderQueryParam;
import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TakeoutOrderService {
    CommonPage<TakeoutOrders> getAllOrder(long userId, Integer pageNum, Integer pageSize);
    CommonPage<TakeoutOrderDto> orderList(TakeoutOrderQueryParam param, Integer pageNum, Integer pageSize);
//    Map orderDetail(long id);
    @Transactional
    CommonResult createOrder(JSONObject map, Admins admins);


    TakeoutOrderDetail orderDetail(long id);


    int updateOrderRemark(TakeoutOrderDto dto);


    int deleteOrder(long id);



}
