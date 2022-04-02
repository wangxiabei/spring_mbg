package com.aranya.mall.tiny.controller;

import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.common.api.IErrorCode;
import com.aranya.mall.tiny.common.api.ResultCode;
import com.aranya.mall.tiny.dto.AdminDto;
import com.aranya.mall.tiny.mbg.model.Admins;
import com.aranya.mall.tiny.mbg.model.ManageAuthorities;
import com.aranya.mall.tiny.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admins")
public class adminsController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    @ResponseBody
    public CommonResult<Object> login(@RequestBody AdminDto adminDto){
        String token = adminService.login(adminDto.getUsername(), adminDto.getPassword());
        if (token == null) {
            return CommonResult.validateFailed(ResultCode.VALIDATE_FAILED);
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", "Bearer");
        return CommonResult.success(tokenMap);
    }
    @GetMapping("/info")
    @ResponseBody
    public CommonResult info(Principal principal){
        Map<String, Object> result = new HashMap<>();
        if (principal == null){
            return CommonResult.unauthorized(ResultCode.FORBIDDEN);
        }
        Admins admin= adminService.getByPhone(principal.getName());
        String username = admin.getName();
        result.put("username", username);
        List<ManageAuthorities> authorities =  adminService.getAuthList(admin.getId());
        result.put("roles",authorities);
        return CommonResult.success(result);
    }
}
