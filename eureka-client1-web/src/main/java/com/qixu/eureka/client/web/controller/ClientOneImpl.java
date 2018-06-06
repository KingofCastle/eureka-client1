package com.qixu.eureka.client.web.controller;

import com.qixu.eureka.client.api.ClientOneApi;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author castle
 * @date 2018/6/5 19:21
 **/
@RestController
public class ClientOneImpl implements ClientOneApi {
    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hi,"+name+",I am client one!";
    }
}
