package com.aranya.mall.tiny.config;

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QiniuConfig {
    @Value("${qiniu.accessKey}")
    private String accessKey;
    @Value("${qiniu.secretKey}")
    private String secretKey;
    @Value("${qiniu.zone}")
    private String zone;

    @Bean
    public com.qiniu.storage.Configuration qiNiuConfig() throws Exception {
        return new com.qiniu.storage.Configuration(Zone.zone1());
    }

    @Bean
    public UploadManager uploadManager() throws Exception {
        return new UploadManager(qiNiuConfig());
    }

    @Bean
    public Auth auth(){
        return Auth.create(accessKey,secretKey);
    }

    @Bean
    public BucketManager bucketManager() throws Exception {
        return new BucketManager(auth(),qiNiuConfig());
    }
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
