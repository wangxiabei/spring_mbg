package com.aranya.mall.tiny.mapper;

import com.aranya.mall.tiny.dto.DepartmentsDto;
import com.aranya.mall.tiny.mbg.model.Departments;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface DepartmentsDtoMapper {
    List<DepartmentsDto> toListDto(List<Departments> departments);
}
