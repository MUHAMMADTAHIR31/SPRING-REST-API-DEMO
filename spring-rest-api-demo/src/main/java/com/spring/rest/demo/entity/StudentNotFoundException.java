/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.demo.entity;

/**
 *
 * @author Dell
 */
public class StudentNotFoundException  extends RuntimeException{

    public StudentNotFoundException(String string) {
        super(string);
    }

    public StudentNotFoundException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StudentNotFoundException(Throwable thrwbl) {
        super(thrwbl);
    }

    
   
    
    
    
}
