package com.goit.lessons.homeWork.module04.objectSquare;



public class ObjectsSquare {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Triangle square is " + triangle.square(2,3));
        System.out.println("Circle square is " + circle.square(1));
        System.out.println("Rectangle square is " + rectangle.square(5,2));
    }
}
