package com.company;

public class Text {

    public static void main(String[] args) {
String input = "Era odată o babă şi un moşneag. Baba avea o găină, şi moşneagul un cucoş; găina babei se oua de câte două ori.";

int result = TextParser.countW(input);
        System.out.println("Total words are: " + result);

        int result2 = TextParser.countS(input);
        System.out.println("Total sentences: " + result2);
    }

}
