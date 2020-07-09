package com.sw.study.scn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sw
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication8761 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication8761.class,args);
    }
}
