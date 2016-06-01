package com.goit.lessons.homeWork.module04.objectSquare;

import java.lang.Math;

public class ObjectsSquare {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(45, 45);
        Circle circle = new Circle(10);
        Squer squer = new Squer(20, 10);

        System.out.println("Squer Square is " + squer.getA()*squer.getB());
        System.out.println("Triangle Square is " + triangle.getH()*triangle.getA()*0.5);
        System.out.println("Cicle Square is " + Math.PI*Math.pow(circle.getR(), 2));
    }
}
