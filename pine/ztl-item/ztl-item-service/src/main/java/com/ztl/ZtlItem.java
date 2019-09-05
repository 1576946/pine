package com.ztl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZtlItem {
    public static void main(String[] args) {
        SpringApplication.run(ZtlItem.class);
    }
}
