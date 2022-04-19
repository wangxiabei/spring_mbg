package com.aranya.mall.tiny;

import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.alibaba.fastjson.JSON;
import com.aranya.mall.tiny.common.redis.RedisService;
import com.aranya.mall.tiny.service.*;
import com.qiniu.common.QiniuException;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private RedisService redisService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IQiniuService iQiniuService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private TakeoutRestaurantService service;
    @Test
    public void test(){
//        val example = mallProductService.getProductListByMenuID(27);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("passwordEncoder 123：" + passwordEncoder.encode("123"));
//        System.out.println("passwordEncoder 123456：" + passwordEncoder.encode("123456"));
//        System.out.println(passwordEncoder.matches("123","$2a$10$sz45h9/jFr0B.xh4pu2G/eDuxNabU4v01YM1P3BguvIWUhnaWegtu"));
//        System.out.println(passwordEncoder.matches("$2a$10$sz45h9/jFr0B.xh4pu2G/eDuxNabU4v01YM1P3BguvIWUhnaWegtu","123"));
//        System.out.println(passwordEncoder.matches("123","123"));
    }
    @Test
    public void example() {
        //val代替ArrayList<String>和String类型
        val example = new ArrayList<String>();
        example.add("Hello World!");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }
    @Test
    public void example2() {
        //val代替Map.Entry<Integer,String>类型
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
    @Test
    public void example3(){
//        System.out.println("111");
//        System.out.println(DateUtil.offset(DateUtil.parse("2021-06-21"), DateField.DAY_OF_MONTH, 2));
//        System.out.println("222");
//        MallMenus menus = new MallMenus();
//        menus.setName("分类");
//        menus.setLevel(1);
//        menus.setTypes(1);
//        String strjson = JSONUtil.parse(menus).toString();
//        System.out.println(JSONUtil.toBean(strjson,MallMenus.class));
//        List<MallMenus> list = new ArrayList<>();
//        list.add(menus);
//        String jsonList = JSONUtil.parse(list).toString();
//        System.out.println(JSONUtil.toList(new JSONArray(jsonList), MallMenus.class));
//        System.out.println(SecureUtil.md5("12345"));
        Log log = LogFactory.get();
        String hashPwd = DigestUtil.bcrypt("12345");
        boolean check = DigestUtil.bcryptCheck("123451",hashPwd);
        System.out.println("密码");
        System.out.println(hashPwd);
        System.out.println(check);
        System.out.println("密码1");
    }
    @Test
    public void testUpload() throws QiniuException{
        String uuid= UUID.randomUUID().toString().replace("-","");
        String file_dress = "/Users/wangxia/Downloads/xx.jpg";
        String[] dress_array = file_dress.split("\\.");
        String fileName = uuid +"."+ dress_array[1];
        String result = iQiniuService.uploadFile(new File(file_dress),fileName);
        System.out.println("result"+result);
    }

    @Test
    public void testDeleteFile() throws QiniuException{
        String result = iQiniuService.delete("5104cd20b6db4806aa32b6ed2af0b6ed.json");
        System.out.println(result);
//        System.out.println(SecureUtil.md5("123"));  // "202cb962ac59075b964b07152d234b70"
//       System.out.println("加密结果"+DigestUtil.md5Hex("123"));
//        System.out.println(DateTime.now().toString("ymdHMS"));
//        System.out.println(UUID.randomUUID().toString().split("-")[1].toUpperCase(Locale.ROOT));
//        System.out.println(BigDecimal.valueOf(1));
//        MallOrderDto mallOrderDto = new MallOrderDto();
//        mallOrderDto.setUserId(112);
    }
    @Test
    public void testMybatis() {
        int x = 0;
        int y = 10;
        int posX = 0;
        int posY = 0;
        posX+= x;
        posY+= y;
        System.out.println("ssss"+posX+","+posY);
    }

}
