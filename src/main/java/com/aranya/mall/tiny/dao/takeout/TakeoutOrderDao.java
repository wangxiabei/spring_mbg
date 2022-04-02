package com.aranya.mall.tiny.dao.takeout;

import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDetail;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderQueryParam;
import com.aranya.mall.tiny.mbg.model.TakeoutOrders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TakeoutOrderDao {


    TakeoutOrderDetail getDetail(long id);

    List<TakeoutOrders> getList(@Param("queryParam") TakeoutOrderQueryParam param);
}
