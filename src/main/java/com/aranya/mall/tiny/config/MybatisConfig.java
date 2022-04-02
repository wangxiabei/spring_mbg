package com.aranya.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.aranya.mall.tiny.mbg.mapper","com.aranya.mall.tiny.dao"})
public class MybatisConfig {
}
