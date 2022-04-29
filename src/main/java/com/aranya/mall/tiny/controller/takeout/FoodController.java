package com.aranya.mall.tiny.controller.takeout;

import cn.hutool.core.date.DateTime;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutFoodStockParam;
import com.aranya.mall.tiny.service.TakeoutFoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/takeouts/foods")
public class FoodController {


    static final Logger logger = LoggerFactory.getLogger(FoodController.class);


    @Autowired
    private TakeoutFoodService service;


    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<TakeoutFoodDto>> geiList(Integer pageSize, Integer pageNum, @RequestParam("restaurantId") long restaurantId){
        return CommonResult.success(service.foodList(pageSize,pageNum,restaurantId));
    }


    @PostMapping("/updateFood")
    @ResponseBody
    public CommonResult updatePosition(@RequestBody TakeoutFoodDto dto){
        int count = service.updatePosition(dto);
        if (count > 0){
            return CommonResult.success(count);
        }else {
         return CommonResult.fail(500,"失败",null);
        }
    }
    @PostMapping("/updateRecommend/{id}")
    @ResponseBody
    public CommonResult updateRecommend(@PathVariable long id){
        int count = service.updateRecommend(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.fail(500,"失败",null);
        }
    }

    @PostMapping("/cancelRecommend/{id}")
    @ResponseBody
    public CommonResult cancelRecommend(@PathVariable long id){
        int count = service.cancelRecommend(id);
        if (count > 0){
            return CommonResult.success(count);
        }else {
            return CommonResult.fail(500,"失败",null);
        }
    }

    @PostMapping("/createStock/{id}")
    @ResponseBody
    public CommonResult createStock(@PathVariable long id, @RequestBody TakeoutFoodStockParam param){
        return CommonResult.success(service.setStockDate(param));
    }

}
