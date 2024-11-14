package com.example.demo.controller;

import com.example.demo.modelLayer.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/students")
public class StudentsController {

   @GetMapping("{id}")
   public Students getStudents(Integer id){
        return new Students(1,"Afreen","Computers");
    }
}

