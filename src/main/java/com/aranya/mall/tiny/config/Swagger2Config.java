package com.aranya.mall.tiny.config;

import com.aranya.mall.tiny.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config extends BaseSwaggerConfig{
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.aranya.mall.tiny.controller")
                .title("mall-demo系统")
                .description("SpringBoot版本中的一些示例")
                .contactName("wx")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
