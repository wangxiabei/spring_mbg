package com.aranya.mall.tiny.controller.takeout;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutRestaurantQueryParam;
import com.aranya.mall.tiny.service.TakeoutRestaurantService;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/takeouts/restaurants")
public class restaurantsController {
    static final Logger logger = LoggerFactory.getLogger(restaurantsController.class);

    @Autowired
    private TakeoutRestaurantService service;

    @GetMapping("/get_details/{id}")
    @ResponseBody
    public CommonResult details(@PathVariable long id){
        Map result =  service.selectById(id);
        logger.info("result:" +result.toString());
        return CommonResult.success(result);
    }

    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<TakeoutRestaurantDto>> list(TakeoutRestaurantQueryParam param, Integer pageSize, Integer pageNum){
        return CommonResult.success(service.getList(param,pageSize,pageNum));
    }
    @GetMapping("/getRestaurant/{id}")
    @ResponseBody
    public CommonResult getRestaurant(@PathVariable long id){
        return CommonResult.success(service.getById(id));
    }
    @PostMapping("/update")
    @ResponseBody
    public CommonResult update(@RequestBody TakeoutRestaurantDto dto){
        return CommonResult.success(service.updateRestaurant(dto));
    }

}
