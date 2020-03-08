package com.sunwell.eureka;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
    	long maxBytes = Runtime.getRuntime().maxMemory();
    	System.out.println("!!!!!!! Max memory: " + maxBytes / 1024 / 1024 + "M");
    	System.out.println("!!!!!!! Args:\n " + Arrays.deepToString(args));

        SpringApplication.run(EurekaServerApplication.class, args);
    }
}