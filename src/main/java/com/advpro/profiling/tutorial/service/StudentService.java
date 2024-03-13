package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Course;
import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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
        List<StudentCourse> studentCourses = studentCourseRepository.findAll();
        return studentCourses.stream()
                .map(studentCourse -> {
                    Student student = studentCourse.getStudent();
                    Course course = studentCourse.getCourse();
                    StudentCourse result = new StudentCourse();
                    result.setStudent(student);
                    result.setCourse(course);
                    return result;
                })
                .collect(Collectors.toList());
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll()
                .stream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        StringJoiner joiner = new StringJoiner(", ");
        for (Student student : students) {
            joiner.add(student.getName());
        }
        return joiner.toString();
    }
}

