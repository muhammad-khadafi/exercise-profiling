package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        List<StudentCourse> studentCoursesList = studentCourseRepository.findAll();
        return studentCoursesList;
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return Optional.ofNullable(studentRepository.findFirstByOrderByGpaDesc());
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        StringJoiner toJoinStrings = new StringJoiner(", ");
        for (Student student : students) {
            toJoinStrings.add(student.getName());
        }
        return toJoinStrings.toString();
    }
}

