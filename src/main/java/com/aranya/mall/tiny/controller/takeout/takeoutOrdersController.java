package com.aranya.mall.tiny.controller.takeout;

import com.alibaba.fastjson.JSONObject;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderQueryParam;
import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.service.AdminService;
import com.aranya.mall.tiny.service.TakeoutOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/takeouts/orders")
public class takeoutOrdersController {
    static final Logger logger = LoggerFactory.getLogger(takeoutOrdersController.class);
    @Autowired
    private TakeoutOrderService takeoutOrderService;
    @Autowired
    private AdminService adminService;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<TakeoutOrderDto>> index(TakeoutOrderQueryParam param, Integer pageSize, Integer pageNum){
        logger.info("11111111");
//        Admins admin= adminService.getByPhone(principal.getName());
////        return CommonResult.success(takeoutOrderService.getAllOrder(1,pageNum,pageSize));
        return CommonResult.success(takeoutOrderService.orderList(param,pageNum,pageSize));
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public CommonResult detail(@PathVariable long id){
        return CommonResult.success(takeoutOrderService.orderDetail(id));
    }

    @PostMapping("/create")
    @ResponseBody
    public CommonResult addOrder(@RequestBody JSONObject map, Principal principal){
        logger.info("1111111111111");
        logger.info("1111:"+map);
        logger.info("1111:"+map);
        logger.info("1111:"+map);
        Admins admin= adminService.getByPhone(principal.getName());
        return takeoutOrderService.createOrder(map,admin);

    }

    @GetMapping("/getDetails/{id}")
    @ResponseBody
    public CommonResult getDetail(@PathVariable long id){
        return null;
    }
}

