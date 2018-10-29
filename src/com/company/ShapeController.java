package com.company;

public class ShapeController {

    public static double getTrianglePermeter(Triangle triangle) {

        int tPerimeter = triangle.lengthOne + triangle.lengthTwo + triangle.lengthThree;

        return tPerimeter;
    }

    public static double getRectanglePermeter(Rectangle rectangle) {

        int rPerimeter = 2 * (rectangle.height + rectangle.width);

        return rPerimeter;

    }

    static void  modifyTriangle(Triangle triangle, int a, int b, int c) {

        triangle.lengthOne = a;
        triangle.lengthTwo = b;
        triangle.lengthThree = c;

    }

    static void modifyRectangle(Rectangle rectangle, int x, int y) {

        rectangle.height = x;
        rectangle.width = y;


    }

    public static double getRaza(Cercale cercale) {

        double raza = Math.PI * (cercale.r * cercale.r);

        return raza;



        }


    }




