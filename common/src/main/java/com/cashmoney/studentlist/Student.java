package com.cashmoney.studentlist;

public class Student
{
    String name;
    String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Student(String name, String email){
        this.email = email;
        this.name = name;
    }
}
