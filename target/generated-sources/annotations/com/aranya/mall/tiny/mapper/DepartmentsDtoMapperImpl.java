package com.aranya.mall.tiny.mapper;

import com.aranya.mall.tiny.dto.DepartmentsDto;
import com.aranya.mall.tiny.mbg.model.Departments;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-21T16:35:43+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class DepartmentsDtoMapperImpl implements DepartmentsDtoMapper {

    @Override
    public List<DepartmentsDto> toListDto(List<Departments> departments) {
        if ( departments == null ) {
            return null;
        }

        List<DepartmentsDto> list = new ArrayList<DepartmentsDto>( departments.size() );
        for ( Departments departments1 : departments ) {
            list.add( departmentsToDepartmentsDto( departments1 ) );
        }

        return list;
    }

    protected DepartmentsDto departmentsToDepartmentsDto(Departments departments) {
        if ( departments == null ) {
            return null;
        }

        DepartmentsDto departmentsDto = new DepartmentsDto();

        departmentsDto.setId( departments.getId() );
        departmentsDto.setCompanyId( departments.getCompanyId() );
        departmentsDto.setName( departments.getName() );

        return departmentsDto;
    }
}
