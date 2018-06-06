package com.qixu.eureka.client.api;

import com.qixu.eureka.client.constants.ClientConstants;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author castle
 * @date 2018/6/5 19:13
 **/
@FeignClient(value = ClientConstants.APPLICATION_NAME)
public interface ClientOneApi {
    /**
     * 说hello的方法
     * @return
     */
    @RequestMapping(value = "/say",method = RequestMethod.POST)
    String sayHello(@RequestParam(value = "name")String name);
}
