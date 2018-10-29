package com.company;

import com.company.takewill.Student;

public class StudentsSuperviser {

    public static Student[] students;
    public static int studentsLength;

    public static void addStudent(Student student) {
        students[studentsLength] = student;
        studentsLength++;
    }

}


