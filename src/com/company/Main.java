package com.company;


import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] arg) {

        Cercale one = new Cercale();

        one.r = 3;

        System.out.println(ShapeController.getRaza(one));


        Triangle doi = new Triangle();
        doi.lengthOne = 2;
        doi.lengthTwo = 3;
        doi.lengthThree = 4;

        System.out.println(ShapeController.getTrianglePermeter(doi));

        Rectangle trei = new Rectangle();
        trei.width = 3;
        trei.height = 4;
        System.out.println(ShapeController.getRectanglePermeter(trei));

       Triangle patru = new Triangle();
       ShapeController.modifyTriangle(patru, 3, 4, 5);

        Rectangle cinci = new Rectangle();
        ShapeController.modifyRectangle(cinci, 2, 3);



    }


}


