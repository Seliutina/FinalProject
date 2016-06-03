package com.goit.lessons.homeWork.module04.objectSquare;


public class Circle implements Shape{
    @Override
    public double square(double... args) {
        double S = 1;
        for (double i : args){
            S = Math.pow(i, 2)*Math.PI;
        }
        return S;
    }
}

