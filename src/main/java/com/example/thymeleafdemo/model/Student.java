package com.example.thymeleafdemo.model;


import java.util.List;

public class Student {
    private String firstName;
    private String lastName;

    private String country;

    private String languages;

    private List operatingSystem;

    public Student(){

    }

    public Student(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName= lastName;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public List getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
