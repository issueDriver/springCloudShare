package com.zuojie.api.controller;

import com.netflix.niws.client.http.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/getOrder")
    public String getOrder(){

        String forObject = restTemplate.getForObject("http://springcloud-member/getMember", String.class);
        System.out.println(forObject);
        return forObject;


    }
}
