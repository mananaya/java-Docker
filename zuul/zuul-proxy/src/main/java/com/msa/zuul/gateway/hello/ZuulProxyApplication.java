package com.msa.zuul.gateway.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableZuulProxy
@SpringBootApplication
public class ZuulProxyApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyApplication.class, args);
    }
    
    @RequestMapping("/")
    public String home() {
    	return "Welcome to ZUUL Proxy...";
    }
}