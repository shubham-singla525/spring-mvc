package com.example.thymeleafdemo.controller;

import com.example.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        theModel.addAttribute("student",new Student("Sita","Ram"));

        theModel.addAttribute("countries", countries);

        return "show-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        System.out.println("The name of the student is:"+
                theStudent.getFirstName()+" "+
                theStudent.getLastName());



        return "student-confirm.html";

    }
}
