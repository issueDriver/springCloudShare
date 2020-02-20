package com.zuojie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka9000 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka9000.class,args);

    }
}
