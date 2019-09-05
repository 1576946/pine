package com.ztl;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZtlGateway {
    public static void main(String[] args) {
        SpringApplication.run(ZtlGateway.class);
    }
}
