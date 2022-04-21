package com.aranya.mall.tiny.controller;

import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/companies")
public class CompaniesController {

    @Autowired
    private CompaniesService service;

    @GetMapping("/getList")
    @ResponseBody
    public CommonResult getList(){
        return CommonResult.success(service.getList());
    }

    @GetMapping("/getDepartmentList/{id}")
    @ResponseBody
    public CommonResult getDepartments( @PathVariable long id){
        return CommonResult.success(service.getByCompany(id));

    }



}
