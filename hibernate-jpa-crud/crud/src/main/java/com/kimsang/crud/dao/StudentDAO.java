package com.kimsang.crud.dao;

import com.kimsang.crud.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
