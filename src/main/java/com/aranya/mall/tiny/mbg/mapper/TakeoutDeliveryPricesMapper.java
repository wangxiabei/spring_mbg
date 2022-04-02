package com.aranya.mall.tiny.mbg.mapper;

import com.aranya.mall.tiny.mbg.model.TakeoutDeliveryPrices;
import com.aranya.mall.tiny.mbg.model.TakeoutDeliveryPricesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TakeoutDeliveryPricesMapper {
    long countByExample(TakeoutDeliveryPricesExample example);

    int deleteByExample(TakeoutDeliveryPricesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TakeoutDeliveryPrices record);

    int insertSelective(TakeoutDeliveryPrices record);

    List<TakeoutDeliveryPrices> selectByExample(TakeoutDeliveryPricesExample example);

    TakeoutDeliveryPrices selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TakeoutDeliveryPrices record, @Param("example") TakeoutDeliveryPricesExample example);

    int updateByExample(@Param("record") TakeoutDeliveryPrices record, @Param("example") TakeoutDeliveryPricesExample example);

    int updateByPrimaryKeySelective(TakeoutDeliveryPrices record);

    int updateByPrimaryKey(TakeoutDeliveryPrices record);
}