package com.company;

public class Main5 {

    public static void main(String[] args) {
        int i = Integer.parseInt("123321");
        int x1 = i % 10;
        int x2 = i / 10 % 10;
        int x3 = i / 100 % 10;
        int x4 = i / 1000 % 10;
        int x5 = i / 10000 % 10;
        int x6 = i / 100000 % 10;
        if ((x1 + x2 + x3) == (x4 + x5) + x6) {
            System.out.println("The ticket is lucky:)");
        } else {
            System.out.println(" The ticket is not lucky:(");
        }
    }

}



