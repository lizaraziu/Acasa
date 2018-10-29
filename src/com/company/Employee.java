package com.company;

import java.util.Arrays;

public class Employee {

    String name;
    String countryBirth;
    double salary;
    double [] schoolMark;

    void printEmployee() {


        System.out.println("My name is: " + name);
        System.out.println("I am from: " + countryBirth);
        System.out.println("My salary is: " + salary + " Euro");
        System.out.println("My baccalaureate marks are: " + Arrays.toString(schoolMark));


    }


    }




