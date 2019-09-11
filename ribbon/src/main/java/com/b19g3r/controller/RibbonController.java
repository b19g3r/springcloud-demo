package com.b19g3r.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-10 11:11 PM
 */

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    private final RestTemplate restTemplate;

    public RibbonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/findAll")
    public Collection findAll() {
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
