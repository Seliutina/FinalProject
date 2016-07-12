package com.goit.lessons.homeWork.module04.objectSquare;

public class Rectangle implements Shape {

    public double square(double... args) {
        double S = 1;
        for(double i : args){
            S = S*i;
        }
        return S;
    }
}


