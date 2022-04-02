package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutDeliveryRegionPrices;
import com.aranya.mall.tiny.mbg.model.TakeoutDeliveryRegionPricesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutDeliveryRegionPricesMapper {
    long countByExample(TakeoutDeliveryRegionPricesExample example);

    int deleteByExample(TakeoutDeliveryRegionPricesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutDeliveryRegionPrices record);

    int insertSelective(TakeoutDeliveryRegionPrices record);

    List<TakeoutDeliveryRegionPrices> selectByExample(TakeoutDeliveryRegionPricesExample example);

    TakeoutDeliveryRegionPrices selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutDeliveryRegionPrices record, @Param("example") TakeoutDeliveryRegionPricesExample example);

    int updateByExample(@Param("record") TakeoutDeliveryRegionPrices record, @Param("example") TakeoutDeliveryRegionPricesExample example);

    int updateByPrimaryKeySelective(TakeoutDeliveryRegionPrices record);

    int updateByPrimaryKey(TakeoutDeliveryRegionPrices record);
}