package com.qixu.eureka.client.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author castle
 * @date 2018/6/4 16:36
 **/
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientOneApplication {
    public static void main(String[] args) {

        SpringApplication.run(EurekaClientOneApplication.class, args);
    }
}
