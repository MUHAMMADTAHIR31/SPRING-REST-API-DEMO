/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.demo.controller;

import com.spring.rest.demo.entity.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Dell
 */
@ControllerAdvice
public class StudentRestExceptionHandler {
    
    //add exception handle code here
    
     //add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exce){
        
        // create a StudentErrorRespopnse
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessagge(exce.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        
        //return ResponseEntity
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
    
    //add another exception handler .. to catch any exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exce){
            
        // create a StudentErrorRespopnse
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessagge(exce.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        
        //return ResponseEntity
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }     
}
