package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.BusinessStrategyNotes;
import com.aranya.mall.tiny.mbg.model.BusinessStrategyNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessStrategyNotesMapper {
    long countByExample(BusinessStrategyNotesExample example);

    int deleteByExample(BusinessStrategyNotesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusinessStrategyNotes record);

    int insertSelective(BusinessStrategyNotes record);

    List<BusinessStrategyNotes> selectByExample(BusinessStrategyNotesExample example);

    BusinessStrategyNotes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusinessStrategyNotes record, @Param("example") BusinessStrategyNotesExample example);

    int updateByExample(@Param("record") BusinessStrategyNotes record, @Param("example") BusinessStrategyNotesExample example);

    int updateByPrimaryKeySelective(BusinessStrategyNotes record);

    int updateByPrimaryKey(BusinessStrategyNotes record);
}