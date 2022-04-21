package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.Departments;
import com.aranya.mall.tiny.mbg.model.DepartmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentsMapper {
    long countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Departments record);

    int insertSelective(Departments record);

    List<Departments> selectByExample(DepartmentsExample example);

    Departments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}