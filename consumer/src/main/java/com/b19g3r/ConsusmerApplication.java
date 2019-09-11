package com.b19g3r;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-10 8:22 PM
 */

@SpringBootApplication
public class ConsusmerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsusmerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
