package com.b19g3r.repository;

import com.b19g3r.entity.Student;

import java.util.Collection;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-08 11:00 PM
 */

public interface StudentRepository {

    Collection<Student> findAll();

    Student findById(long id);

    void saveOrUpdate(Student student);

    void deleteById(long id);

}
