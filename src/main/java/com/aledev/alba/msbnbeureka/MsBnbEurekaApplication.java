package com.aledev.alba.msbnbeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsBnbEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBnbEurekaApplication.class, args);
    }

}
