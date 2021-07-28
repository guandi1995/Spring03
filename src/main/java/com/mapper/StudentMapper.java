package com.mapper;

import com.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper {
    List<Student> fetchStudents();
}
