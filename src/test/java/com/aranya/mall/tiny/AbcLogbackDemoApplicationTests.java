package com.aranya.mall.tiny;

import cn.hutool.json.JSONUtil;
import com.aranya.mall.tiny.mbg.model.MallMenus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AbcLogbackDemoApplicationTests {
    static final Logger logger = LoggerFactory.getLogger(AbcLogbackDemoApplicationTests.class);

    @Test
    public void logbackTest(){
        logger.info("进入日志测试");
        try {
            MallMenus mallMenus = new MallMenus("1",1,"",1,1);
            logger.info("mallMenus的参数"+ JSONUtil.toJsonStr(mallMenus));
        }catch (Exception e){
            logger.error("出错了",e.getMessage(),e.getCause());
            e.printStackTrace();
        }
        logger.info("logback完毕");
        logger.info("AbcLogbackDemoApplicationTests演示延毕");
    }
}
