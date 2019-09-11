package com.b19g3r.repository.impl;

import com.b19g3r.entity.Student;
import com.b19g3r.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author b19g3r
 * @version v0.1
 * @date 2019-09-08 11:03 PM
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "Tom1", 21));
        studentMap.put(2L, new Student(2L, "Tom2", 22));
        studentMap.put(3L, new Student(3L, "Tom3", 23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);

    }
}
