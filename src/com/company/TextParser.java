package com.company;

public class TextParser {

    public static int countW(String s) {
        String[] words = s.split(" ");

        int count = 0;

        for (String w : words) {

            count++;
        }
        return count;
    }


public static int countS(String p){
    String[] sentences = p.split("[.!?:]");

    int scount = 0;

    for( scount=0;scount<sentences.length;scount++){

    }
return scount;


    }
}







