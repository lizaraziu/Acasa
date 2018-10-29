package com.company;

public class lucky {

    static boolean isLucky(String s) {
        String[] digits = s.split("");
        int x1 = Integer.parseInt(digits[0]);
        int x2 = Integer.parseInt(digits[1]);
        int x3 = Integer.parseInt(digits[2]);
        int x4 = Integer.parseInt(digits[3]);
        int x5 = Integer.parseInt(digits[4]);
        int x6 = Integer.parseInt(digits[5]);

        return (x1 + x2 + x3) == (x4 + x5 + x6);

    }
}
