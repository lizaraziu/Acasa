package com.company.takewill;

public class Student {

    String name;
    int age;
    double height;

    void printDetails() {
        printAge();
        printName();



    }
    void printName() {
        System.out.println("My name is " + name);
    }

    void printAge() {
        System.out.println("Age " + age);
    }

}
