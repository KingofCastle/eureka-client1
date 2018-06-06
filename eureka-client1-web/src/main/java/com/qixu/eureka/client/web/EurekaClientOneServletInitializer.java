package com.qixu.eureka.client.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author castle
 * @date 2018/6/5 10:05
 **/
public class EurekaClientOneServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EurekaClientOneApplication.class);
    }
}
