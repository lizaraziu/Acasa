package com.company.takewill;

import com.company.StudentsSuperviser;

public class App {
    public static void main(String[] args) {

        Student daria = new Student();
        daria.name = "Daria ";
        daria.age = 22;
        Student ana = new Student();
        ana.name = "Ana ";
        ana.age = 23;
        Student cris = new Student();
        cris.name = "Cristina ";
        cris.age = 18;

        Student[] students = new Student[20];

        StudentsSuperviser.students = students;

        StudentsSuperviser.addStudent(daria);
        StudentsSuperviser.addStudent(ana);
        StudentsSuperviser.addStudent(cris);
        StudentsSuperviser.addStudent(cris);
        StudentsSuperviser.addStudent(cris);


        System.out.println(StudentsSuperviser.studentsLength);
        for (int i = 0; i<StudentsSuperviser.studentsLength; i++){
            System.out.println(StudentsSuperviser.students[i].name);
        }



    }
}
