package com.aranya.mall.tiny.service.impl;

import com.aranya.mall.tiny.dto.DepartmentsDto;
import com.aranya.mall.tiny.mapper.DepartmentsDtoMapper;
import com.aranya.mall.tiny.mbg.mapper.CompaniesMapper;
import com.aranya.mall.tiny.mbg.mapper.DepartmentsMapper;
import com.aranya.mall.tiny.mbg.model.Companies;
import com.aranya.mall.tiny.mbg.model.CompaniesExample;
import com.aranya.mall.tiny.mbg.model.Departments;
import com.aranya.mall.tiny.mbg.model.DepartmentsExample;
import com.aranya.mall.tiny.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompaniesServiceImpl implements CompaniesService {

    @Autowired
    private CompaniesMapper mapper;

    @Autowired
    private DepartmentsMapper departmentsMapper;

    @Autowired
    private  DepartmentsDtoMapper departmentsDtoMapper;

    @Override
    public List<Map<String,Object>> getList() {
        CompaniesExample example = new CompaniesExample();
        example.createCriteria().andDeletedAtIsNull();
        example.setOrderByClause("id asc");
        List<Companies> companies  = mapper.selectByExample(example);
        List<Map<String,Object>> resu = new ArrayList<>();
        for (Companies c : companies){
            Map res = new HashMap();
            res.put("id",c.getId());
            res.put("name",c.getName());
            res.put("children",getByCompany(c.getId()));
            resu.add(res);
        }
        return resu;
    }

    @Override
    public List<DepartmentsDto> getByCompany(long id) {
        DepartmentsExample example = new DepartmentsExample();
        example.createCriteria().andCompanyIdEqualTo((int) id).andDeletedAtIsNull();
        example.setOrderByClause("id asc");
        List<DepartmentsDto> dto = departmentsDtoMapper.toListDto(departmentsMapper.selectByExample(example));
        return dto;
    }
}
