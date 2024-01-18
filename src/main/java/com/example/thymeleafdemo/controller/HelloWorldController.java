package com.example.thymeleafdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/processFormVersionTwo")
    public String processFormShoutOut(HttpServletRequest request, Model theModel){
        // extract data from form
        String name = request.getParameter("studentName");

        // make some message
        String result = "Yo! "+name;

        // add in model
        theModel.addAttribute("theName", name);
        theModel.addAttribute("theMessage",result);
        return "processFormShoutOut";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormShoutOutV3(@RequestParam("studentName") String name, Model theModel){

        String newName = name.toUpperCase();
        String message ="Hey this is v3 but you are so cool Mr. "+ newName;
        theModel.addAttribute("theMessage", message);
        return "processFormShoutOutV3";
    }
}
