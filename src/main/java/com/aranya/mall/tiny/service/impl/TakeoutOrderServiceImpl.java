package com.aranya.mall.tiny.service.impl;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aranya.mall.tiny.common.api.CommonPage;
import com.aranya.mall.tiny.common.api.CommonResult;
import com.aranya.mall.tiny.common.utils.DateFormat;
import com.aranya.mall.tiny.dao.takeout.TakeoutOrderDao;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDetail;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderDto;
import com.aranya.mall.tiny.dto.takeout.TakeoutOrderQueryParam;
import com.aranya.mall.tiny.mapper.takeout.OrderMapper;
import com.aranya.mall.tiny.mbg.mapper.*;
import com.aranya.mall.tiny.mbg.model.*;
import com.aranya.mall.tiny.service.TakeoutOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class TakeoutOrderServiceImpl implements TakeoutOrderService {
    private static Logger logger = LoggerFactory.getLogger(TakeoutOrderServiceImpl.class);

    @Autowired
    private TakeoutOrdersMapper takeoutOrdersMapper;
    @Autowired
    private TakeoutRestaurantsMapper restaurantsMapper;
    @Autowired
    private TakeoutFoodsMapper foodsMapper;
    @Autowired
    private TakeoutFoodTastesMapper tastesMapper;
    @Autowired
    private TakeoutDeliveryRegionPricesMapper pricesMapper;
    @Autowired
    private TakeoutOrderFoodsMapper orderFoodsMapper;
    @Autowired
    private TakeoutOrderFoodTastesMapper orderFoodTastesMapper;


    @Autowired
    private OrderMapper coverOrderMapper;

    @Autowired
    private TakeoutOrderDao orderDao;
    @Override
    public CommonPage<TakeoutOrders> getAllOrder(long userId, Integer pageNum, Integer pageSize) {
        //1.????????????
        PageHelper.startPage(pageNum, pageSize);
        TakeoutOrdersExample example = new TakeoutOrdersExample();
        example.createCriteria().andDeletedAtIsNull();
        example.setOrderByClause("created_at desc");
        //2.?????????????????????????????????
        List<TakeoutOrders> list = takeoutOrdersMapper.selectByExample(example);
        //3.???pageInfo??????????????????
        PageInfo<TakeoutOrders> pageInfo = new PageInfo<>(list);
        //4.??????????????????????????????
        List<TakeoutOrders> pageinfo_list = pageInfo.getList();
        //5.??????????????????????????????
        List result_list = new ArrayList();
        for (TakeoutOrders l : pageinfo_list){
            Map<String,Object> map = new HashMap<>();
            map.put("id",l.getId());
            map.put("order_no",l.getOrderNo());
            map.put("restaurant_name",l.getRestaurantName());
            map.put("status",l.getStatus());
            map.put("status_name",statusAsChinese(l.getStatus()));
            map.put("amount",l.getAmount());
            map.put("delivery_type",l.getDeliveryType());
            map.put("created_at", DateFormat.dateFormat(l.getCreatedAt()));
            map.put("user",1);
            map.put("deliver",l.getDeliveryerName());
            map.put("book_time",l.getBookingDeliveryAt());
            map.put("package_count",l.getPackageCount());
            map.put("address",l.getAddress());
            result_list.add(map);
        }
        //6.pageInfo??????????????????list
        pageInfo.setList(result_list);
        return CommonPage.restPage(pageInfo);
    }

    @Override
    public CommonPage<TakeoutOrderDto> orderList(TakeoutOrderQueryParam param, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        logger.info("param:"+param);
        logger.info("param:"+param);
        logger.info("param:"+param);
        logger.info("param:"+param);
        logger.info("param:"+param);
        logger.info("param:"+param);
        logger.info("param:"+param);
        List<TakeoutOrders> orderlist = orderDao.getList(param);
        PageInfo pageInfo = new PageInfo<>(orderlist);
        List<TakeoutOrderDto> dto = new ArrayList<>();
        for (TakeoutOrders order : orderlist){
            TakeoutOrderDto orderDto = new TakeoutOrderDto();
            dto.add(coverOrderMapper.toDto(order));
        }
        pageInfo.setList(dto);
        return CommonPage.restPage(pageInfo);

    }

//    @Override
//    public Map orderDetail(long id) {
//        TakeoutOrders order = takeoutOrdersMapper.selectByPrimaryKey(id);
//        //user??????
//        Users user = order.getUser();
//        Map<Object,Object> userMap = MapUtil.of(new Object [][]{
//                {"user_name", user.getName()},
//                {"user_phone", user.getPhone()}
//        });
//        //????????????
//        List<TakeoutOrderFoods> orderFoodsList =  order.getOrderFoodsList();
//        List<Object> foodList = new ArrayList<>();
//        List<Object> additions = new ArrayList<>();
//        for (TakeoutOrderFoods orderFoods : orderFoodsList){
//            List<Map<Object, Object>> s = new ArrayList<>();
//            Map<Object,Object> res = MapUtil.of(new Object [][]{
//                    {"name",orderFoods.getName()},
//                    {"count", orderFoods.getCount()},
//                    {"total_price", orderFoods.getAmount()},
//                    {"addtion", orderFoods.getOrderFoodTastesList()}
//            });
//            s.add(res);
//            foodList.add(s);
//        }
//        Map<Object,Object> packageMaps = MapUtil.of(new Object [][]{
//                {"name", "?????????"},
//                {"count", order.getPackageCount()},
//                {"total_price", order.getPackageAmount()}
//        });
//        Map<Object,Object> tableWareMaps = MapUtil.of(new Object [][]{
//                {"name", "??????"},
//                {"count", order.getTablewareCount()},
//                {"total_price", order.getTablewareAmount()}
//        });
//        Map<Object,Object> DeliveryMaps = MapUtil.of(new Object [][]{
//                {"name", "?????????"},
//                {"count", 1},
//                {"total_price", order.getDeliveryAmount()}
//        });
//        //?????????
//        additions.add(packageMaps);
//        additions.add(tableWareMaps);
//        additions.add(DeliveryMaps);
//        //?????????????????????????????????list???
//        foodList.add(additions);
//        //??????????????????
//        Map<Object,Object> result = MapUtil.of(new Object [][]{
//                {"restaurant_id", order.getRestaurantId()},
//                {"restaurant_name", order.getRestaurantName()},
//                {"order_no", order.getOrderNo()},
//                {"order_state", order.getStatus()},
//                {"order_state_name", statusAsChinese(order.getStatus())},
//                {"total_price", order.getAmount()},
//                {"user_info", userMap},
//                {"food_list", foodList}
//        });
//        return result;
//    }

    @Override
    public CommonResult createOrder(JSONObject map, Admins admins) {
        BigDecimal package_total_price = new BigDecimal("0"); //???????????????
        BigDecimal package_total_count = new BigDecimal("0"); //??????????????????
        BigDecimal order_price = new BigDecimal("0"); //????????????
        BigDecimal original_amount = new BigDecimal("0"); //???????????????
        BigDecimal food_total_price = new BigDecimal("0"); //??????????????????????????????
        BigDecimal food_original_total_price = new BigDecimal("0"); //?????????????????????????????????
        BigDecimal tableware_amount = new BigDecimal("0"); //????????????
        BigDecimal tableware_count = new BigDecimal("0"); //????????????
        BigDecimal taste_amount = new BigDecimal("0"); //????????????
        BigDecimal delivery_amount = new BigDecimal("0");// #?????????
        Integer restaurant_id = map.getInteger("restaurant_id");
        Integer tablewareCount = 0; //????????????
        Integer address_levle1_id = 0;
        //????????????
        JSONObject takeout_user_info_json =  map.getJSONObject("takeout_user_info");
        //????????????
        CommonResult commonResult = null;
        TakeoutRestaurants restaurant =  restaurantsMapper.selectByPrimaryKey(restaurant_id.longValue());//????????????
        if (restaurant == null || restaurant.getStatus() == 1){
            commonResult = CommonResult.fail(500,"??????????????????",null);
        }
        //????????????
        JSONObject out_time_json = map.getJSONObject("out_time");
        if (out_time_json.isEmpty()){
            commonResult = CommonResult.fail(500,"????????????????????????",null);
        }
        //??????????????????
        Integer out_type = out_time_json.getInteger("out_type");
        if (out_type.equals(0) || out_type == null){
            commonResult = CommonResult.fail(500,"??????????????????????????????",null);
        }
        //????????????????????????
        Date select_date =  out_time_json.getDate("select_date");
        if (select_date == null){
            commonResult = CommonResult.fail(500,"????????????????????????",null);
        }
        if (takeout_user_info_json == null || takeout_user_info_json.isEmpty()){
            commonResult = CommonResult.fail(500,"?????????????????????",null);
        }
        if (out_type == 3){
            if (takeout_user_info_json.getString("phone") == null){
                commonResult = CommonResult.fail(500,"?????????????????????????????????",null);
            }
        }else {
            if (takeout_user_info_json.getJSONArray("address_ids") == null){
                commonResult = CommonResult.fail(500,"????????????????????????",null);
            }
//            JSONArray address_ids = takeout_user_info_json.getJSONArray("address_ids");
//            address_levle1_id = address_ids.get(0);
        }
        JSONArray food_list_json = map.getJSONArray("food_list");
        for (int i = 0; i < food_list_json.size(); i++){
            //??????food_list???????????????
            JSONObject food_json = (JSONObject)food_list_json.getJSONObject(i);
            Integer food_id = food_json.getInteger("food_id");
            Integer food_count = food_json.getInteger("count"); //????????????
            //????????????
            TakeoutFoods food = foodsMapper.selectByPrimaryKey(food_id.longValue());
            if (BeanUtil.isEmpty(food)){
                commonResult = CommonResult.fail(500,"???????????????",null);
            }
            order_price = order_price.add(food.getPrice().multiply(BigDecimal.valueOf(food_count)));//?????????????????????
            original_amount = original_amount.add(food.getPrice().multiply(BigDecimal.valueOf(food_count)));//?????????
            food_original_total_price = food_original_total_price.add(food.getPrice().multiply(BigDecimal.valueOf(food_count)));//????????????
            package_total_count = package_total_count.add(BigDecimal.valueOf(food.getPackageCount()).multiply(BigDecimal.valueOf(food_count))); //??????????????????
            //????????????
            JSONArray tastes_list_json =  food_json.getJSONArray("tastes_list");

            if (tastes_list_json.size() > 1){
                for (int k = 0; k < tastes_list_json.size(); k ++){
                    JSONObject tastes_json = (JSONObject)tastes_list_json.getJSONObject(i);
                    Integer tastes_id = tastes_json.getInteger("tastes_id");
                    taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
                }
            }else {
                JSONObject tastes_json = tastes_list_json.getJSONObject(0);
                Integer tastes_id = tastes_json.getInteger("tastes_id");
                taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
            }
        }
        //???????????????
        package_total_price = package_total_price.add(restaurant.getPackagePrice().multiply(package_total_count));
        order_price =  order_price.add(package_total_price).add(taste_amount); //????????????
        original_amount =  original_amount.add(package_total_price).add(taste_amount);//????????????
        food_total_price =  food_total_price.add(taste_amount);
        food_original_total_price =  food_original_total_price.add(taste_amount);
        //??????
        JSONObject tableware_json = map.getJSONObject("tableware");
        if (!tableware_json.isEmpty()){
            tablewareCount = tableware_json.getInteger("count");
            tableware_amount = restaurant.getTablewarePrice().multiply(BigDecimal.valueOf(tablewareCount));//??????
            order_price = order_price.add(tableware_amount);
            original_amount = original_amount.add(tableware_amount);
        }
        //?????????
        if (out_type != 3){
           JSONArray address_ids = takeout_user_info_json.getJSONArray("address_ids");
           String addiress_id_one = (String) address_ids.get(0);
           TakeoutDeliveryRegionPricesExample example = new TakeoutDeliveryRegionPricesExample();
            example.createCriteria().
                    andMinPriceLessThan(food_original_total_price).
                    andMaxPriceGreaterThanOrEqualTo(food_original_total_price).
                    andRestaurantIdEqualTo(restaurant_id).
                    andDeletedAtIsNull().
                    andRegionCodeEqualTo(takeout_user_info_json.getString("takeout_area_id")).
                    andAddressParentIdEqualTo(Integer.valueOf(addiress_id_one));
            List<TakeoutDeliveryRegionPrices> pricesList =  pricesMapper.selectByExample(example);
            if (pricesList.size() > 0){
                TakeoutDeliveryRegionPrices price_last = pricesList.get(pricesList.size() - 1);
                delivery_amount = price_last.getPrice();
                order_price = order_price.add(delivery_amount);
                original_amount = original_amount.add(delivery_amount);
            }
        }
        TakeoutOrders orders = new TakeoutOrders();
        orders.setRestaurantId(restaurant_id);
        orders.setOrderNo("WM"+DateTime.now().toString("ymdHMS")+ UUID.randomUUID().toString().split("-")[1].toUpperCase(Locale.ROOT));
        orders.setAmount(order_price);
        orders.setStatus(1);
        orders.setUserId(798);
        orders.setRealname(takeout_user_info_json.getString("realname"));
        orders.setPhone(takeout_user_info_json.getString("phone"));
        orders.setAddress(takeout_user_info_json.getString("full_name"));
        orders.setAddressIds(takeout_user_info_json.getString("address_ids"));
        orders.setDeliveryerTypee(out_type);
        orders.setBookingDeliveryAt(DateUtil.format(select_date, "YYYY-MM-dd"));
        orders.setTablewareCount(tablewareCount);
        orders.setTablewareAmount(tableware_amount);
        orders.setTablewarePrice(restaurant.getTablewarePrice());
        orders.setPackageCount(package_total_count.intValue());
        orders.setPackageAmount(package_total_price);
        orders.setPackagePrice(restaurant.getPackagePrice());
        orders.setDeliveryAmount(delivery_amount); //?????????
        orders.setTasteAmount(taste_amount);
        orders.setRemark(map.getString("note"));
        orders.setCreatedAt(DateTime.now());
        orders.setUpdatedAt(DateTime.now());
        orders.setOriginalAmount(original_amount);
        orders.setAddressIds(takeout_user_info_json.getString("address_ids"));
        orders.setRestaurantName(restaurant.getName());
        orders.setChannelType(map.getString("channel_type"));
        int count = takeoutOrdersMapper.insertSelective(orders);
        if (count > 0){
            commonResult = CommonResult.success(orders.getId() - 1);
            logger.info("food_list_json"+food_list_json);
            logger.info("restaurant_id"+restaurant_id);
            int order_food_create_count = createOrderFood(orders.getId() - 1,food_list_json,restaurant_id);
        }else {
            commonResult = CommonResult.fail(500,"????????????",null);
        }
        return commonResult;
    }

    @Override
    public TakeoutOrderDetail orderDetail(long id) {
//        TakeoutOrderDetail detail = new TakeoutOrderDetail();
//        //????????????
//        TakeoutOrders orders = takeoutOrdersMapper.selectByPrimaryKey(id);
//        detail.setTakeoutOrders(orders);
//        //??????????????????
//        TakeoutOrderFoodsExample orderFoodsExample = new TakeoutOrderFoodsExample();
//        orderFoodsExample.createCriteria().andOrderIdEqualTo((int) id);
//        List<TakeoutOrderFoods> orderFoodsList = orderFoodsMapper.selectByExample(orderFoodsExample);
//        detail.setOrderFoodsList(orderFoodsList);
//        //????????????????????????
//        TakeoutOrderFoodTastesExample orderFoodTastesExample = new TakeoutOrderFoodTastesExample();
//        List<Long> order_food_ids = orderFoodsList.stream().map(TakeoutOrderFoods::getId).collect(Collectors.toList());
//        orderFoodTastesExample.createCriteria().andOrderFoodIdIn(order_food_ids);
//        List<TakeoutOrderFoodTastes> foodTastesList = orderFoodTastesMapper.selectByExample(orderFoodTastesExample);
//        detail.setOrderFoodTastesList(foodTastesList);
//        return detail;

        return orderDao.getDetail(id);




    }

    @Override
    public int updateOrderRemark(TakeoutOrderDto dto) {
        TakeoutOrders order = coverOrderMapper.toDo(dto);
        return takeoutOrdersMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public int deleteOrder(long id) {
        return takeoutOrdersMapper.deleteByPrimaryKey(id);
    }

    /**
     * ????????????????????????????????????
     * @param status
     */
    public String statusAsChinese(Integer status){
        String statusChinse = "";
        if (status == 1){
             statusChinse = "?????????";
        }else if (status == 2){
             statusChinse = "????????????";
        }else if (status == 3){
             statusChinse = "?????????";
        }else if (status == 4){
             statusChinse = "?????????";
        }else if (status == 5){
             statusChinse = "?????????";
        }else if (status == 6){
             statusChinse = "?????????";
        }else if (status == 7){
             statusChinse = "?????????";
        }else if (status == 8){
             statusChinse = "?????????";
        }else if (status == 9){
             statusChinse = "????????????";
        }else if (status == 10){
             statusChinse = "????????????";
        }else if (status == 11){
             statusChinse = "?????????";
        }else if (status == 12){
             statusChinse = "????????????";
        }else if (status == 13){
             statusChinse = "?????????";
        }
        return statusChinse;
    }
    //??????????????????
    private BigDecimal cultastea(long tastes_id, Integer count){
        BigDecimal taste_amount = new BigDecimal("0");
        TakeoutFoodTastes foodTastes = tastesMapper.selectByPrimaryKey(tastes_id);
        taste_amount = taste_amount.add(foodTastes.getPrice().multiply(BigDecimal.valueOf(count))); //??????
        return taste_amount;
    }

    private int createOrderFood(long orderId, JSONArray food_list_json, Integer restaurantId){
        TakeoutRestaurants r = restaurantsMapper.selectByPrimaryKey(restaurantId.longValue());
        BigDecimal package_total_count = new BigDecimal("0"); //??????????????????
        BigDecimal food_original_total_price = new BigDecimal("0"); //?????????????????????????????????
        BigDecimal taste_amount = new BigDecimal("0"); // ??????
        int count = 0;
        for (int i = 0; i < food_list_json.size(); i++){
            //??????food_list???????????????
            JSONObject food_json = (JSONObject)food_list_json.getJSONObject(i);
            Integer food_id = food_json.getInteger("food_id");
            Integer food_count = food_json.getInteger("count"); //????????????
            //????????????
            TakeoutFoods food = foodsMapper.selectByPrimaryKey(food_id.longValue());
            if (BeanUtil.isEmpty(food)){
                count = -1;
            }
            food_original_total_price = food_original_total_price.add(food.getPrice().multiply(BigDecimal.valueOf(food_count)));//????????????
            package_total_count = package_total_count.add(BigDecimal.valueOf(food.getPackageCount()).multiply(BigDecimal.valueOf(food_count))); //??????????????????

            //????????????
            JSONArray tastes_list_json =  food_json.getJSONArray("tastes_list");
            if (tastes_list_json.size() > 1){
                for (int k = 0; k < tastes_list_json.size(); k ++){
                    JSONObject tastes_json = (JSONObject)tastes_list_json.getJSONObject(i);
                    Integer tastes_id = tastes_json.getInteger("tastes_id");
                    taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
                    food_original_total_price = food_original_total_price.add(taste_amount);
                }
            }else {
                JSONObject tastes_json = tastes_list_json.getJSONObject(0);
                Integer tastes_id = tastes_json.getInteger("tastes_id");
                taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
                food_original_total_price = food_original_total_price.add(taste_amount);
            }
            TakeoutOrderFoods orderFoods = new TakeoutOrderFoods();
            orderFoods.setOrderId((int) orderId);
            orderFoods.setRestaurantId(restaurantId);
            orderFoods.setName(food.getName());
            orderFoods.setSubname(food.getSubname());
            orderFoods.setPrice(food.getPrice());
            orderFoods.setDiscount(food.getDiscount());
            orderFoods.setCount(food_count);
            orderFoods.setAmount(food_original_total_price);
            orderFoods.setOriginalAmount(food_original_total_price);
            orderFoods.setPackageCount(package_total_count.intValue());
            orderFoods.setPackageAmount(r.getPackagePrice().multiply(BigDecimal.valueOf(food.getPackageCount())).multiply(BigDecimal.valueOf(food_count)));
            orderFoods.setTypee(food.getTypee());
            orderFoods.setOpenType(food.getOpenType());
            orderFoods.setImg(food.getImg());
            orderFoods.setStoryTitle(food.getStoryTitle());
            orderFoods.setStoryContent(food.getStoryContent());
            orderFoods.setDetail(food.getDetail());
            orderFoods.setRemark(food.getRemark());
            orderFoods.setCinvcode(food.getCinvcode());
            orderFoods.setCinvcodeName(food.getCinvcodeName());
            orderFoods.setCreatedAt(DateTime.now());
            orderFoods.setUpdatedAt(DateTime.now());
            orderFoods.setUserId(798);
            orderFoods.setFoodId(food_id);
            count  = orderFoodsMapper.insertSelective(orderFoods);
        }
        return count;
    }
    //        #               tastes_list: [ #????????????, ??????????????????????????????
//        #                       {
//        #                           group_id: 1,??????ID
//        #                           tastes_id: 1, ??????ID
//        #                        },
//        #                       {
//        #                           group_id: 2,??????ID
//        #                           tastes_id: 2, ??????ID
//        #                         },
//        #                           ]
    private CommonResult createOrderTast(JSONArray tastes_list_json, Integer food_count){
        BigDecimal taste_amount = new BigDecimal("0");
        CommonResult commonResult = null;
        if (tastes_list_json.size() > 1){
            for (int k = 0; k < tastes_list_json.size(); k ++){
                JSONObject tastes_json = (JSONObject)tastes_list_json.getJSONObject(k);
                Integer tastes_id = tastes_json.getInteger("tastes_id");
                taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
                TakeoutOrderFoodTastes takeoutOrderFoodTastes = new TakeoutOrderFoodTastes();
            }
        }else {
            JSONObject tastes_json = tastes_list_json.getJSONObject(0);
            Integer tastes_id = tastes_json.getInteger("tastes_id");
            taste_amount = cultastea(tastes_id.longValue(),food_count);//????????????
        }
        return commonResult;
    }
}
