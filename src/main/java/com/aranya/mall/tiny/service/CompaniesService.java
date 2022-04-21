package com.aranya.mall.tiny.service;

import com.aranya.mall.tiny.dto.DepartmentsDto;

import java.util.List;
import java.util.Map;

public interface CompaniesService {
    List<Map<String,Object>> getList();

    List<DepartmentsDto> getByCompany(long id);
}
