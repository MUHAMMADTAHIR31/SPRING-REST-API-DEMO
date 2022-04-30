/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.demo.controller;

import com.spring.rest.demo.entity.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {
    
    //define endpoint for "/student" -return list of student
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        
        List<Student> theStudents = new ArrayList<>();
        
        theStudents.add(new Student("Tahir","Korejo"));
        theStudents.add(new Student("Sarang","Korejo"));
        theStudents.add(new Student("Ali","Korejo"));
        
        return theStudents;
    }
}
