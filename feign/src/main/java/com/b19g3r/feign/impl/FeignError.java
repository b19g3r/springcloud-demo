package com.b19g3r.feign.impl;

import com.b19g3r.entity.Student;
import com.b19g3r.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-11 11:23 PM
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "error ...";
    }
}
