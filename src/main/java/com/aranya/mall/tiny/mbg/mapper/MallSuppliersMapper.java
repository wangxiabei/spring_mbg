package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.MallSuppliers;
import com.aranya.mall.tiny.mbg.model.MallSuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MallSuppliersMapper {
    long countByExample(MallSuppliersExample example);

    int deleteByExample(MallSuppliersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallSuppliers record);

    int insertSelective(MallSuppliers record);

    List<MallSuppliers> selectByExample(MallSuppliersExample example);

    MallSuppliers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallSuppliers record, @Param("example") MallSuppliersExample example);

    int updateByExample(@Param("record") MallSuppliers record, @Param("example") MallSuppliersExample example);

    int updateByPrimaryKeySelective(MallSuppliers record);

    int updateByPrimaryKey(MallSuppliers record);
}