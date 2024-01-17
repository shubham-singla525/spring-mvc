package com.example.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm(){

        return "showFormData";

    }

    @GetMapping("/processForm")
    public String processForm(){
        return "processForm";
    }
}
