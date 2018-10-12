package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ana");
        StringBuilder sb1 = new StringBuilder("Banana");
        System.out.println(sb == sb1);
        StringBuilder sb3 = sb.append("ion");
        System.out.println(sb3 == sb);
        if (sb3 == sb){
            System.out.println(sb3);
        }


        System.out.println();



    }
}
