package com.b19g3r.controller;

import com.b19g3r.entity.Student;
import com.b19g3r.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-11 11:53 PM
 */

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    private final FeignProviderClient feignProviderClient;

    public HystrixController(FeignProviderClient feignProviderClient) {
        this.feignProviderClient = feignProviderClient;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
