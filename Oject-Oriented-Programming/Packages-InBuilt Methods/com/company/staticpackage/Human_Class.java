package com.company.staticpackage;

public class Human_Class {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public Human_Class(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;  //constructor for the class Human_class
        Human_Class.population += 1;
    }
}
