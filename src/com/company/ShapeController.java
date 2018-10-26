package com.company;

public class ShapeController {

    public static getTrianglePermeter(int lengthOne, int lengthTwo, int lengthTree){

        int tPerimeter = lengthOne + lengthTwo + lengthTree;

        return tPerimeter;
    }

    public static getRectanglePermeter(int height, int width){

        int rPerimeter = 2*(height + width);

        return rPerimeter;

    }

    static void modifyTriangle(Triangle triangle, int a, int b, int c){

        triangle.lengthOne = a;
        triangle.lengthTwo = b;
        triangle.getLengthThree = c;
    }

    static void modifyTriangle(Rectangle rectangle, int x, int y){

        rectangle.height = x;
        rectangle.width = y;
    }
}

