package com.b19g3r.controller;

import com.b19g3r.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-10 8:34 PM
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final RestTemplate restTemplate;

    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/findAll")
    public Collection findAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection findAll2() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PostMapping("/update2")
    public void update2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/update", student, null).getBody();
    }

    @DeleteMapping("/deleteByid/{id}")
    public void deleteById(@PathVariable long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}
