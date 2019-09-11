package com.pine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pine.dao.mysql")
public class PineItemService {
    public static void main(String[] args) {
        SpringApplication.run(PineItemService.class);
    }
}
