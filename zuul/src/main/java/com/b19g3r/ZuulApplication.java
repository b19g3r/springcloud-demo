package com.b19g3r;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-10 10:33 PM
 */

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
