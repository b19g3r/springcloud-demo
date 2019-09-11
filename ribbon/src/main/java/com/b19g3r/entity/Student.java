package com.b19g3r.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-08 10:58 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}