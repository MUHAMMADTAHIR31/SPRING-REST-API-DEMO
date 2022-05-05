/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.demo.controller;

import com.spring.rest.demo.entity.StudentNotFoundException;
import com.spring.rest.demo.entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {
    
     List<Student> theStudents;
    
    //load the student
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        
        theStudents.add(new Student("Tahir","Korejo"));
        theStudents.add(new Student("Sarang","Korejo"));
        theStudents.add(new Student("Ali","Korejo"));
    }
    
    //define endpoint for "/student" -return list of student
    @GetMapping("/students")
    public List<Student> getStudents(){
       return theStudents;
    }
    
    //define endpoint for "student/{studentID}"- return student at index
    
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        
        //just index into the  list
        
        //check the studetID againts list size
        if(studentId >= theStudents.size() || (studentId < 0)){
            throw new StudentNotFoundException("Student id not Found -"+ studentId);
        }
        return theStudents.get(studentId);
    }
}
