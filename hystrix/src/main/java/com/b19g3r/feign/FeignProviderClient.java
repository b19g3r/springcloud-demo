package com.b19g3r.feign;

import com.b19g3r.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author xingxuntao
 * @version v0.1
 * @date 2019-09-11 11:06 PM
 */

@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
