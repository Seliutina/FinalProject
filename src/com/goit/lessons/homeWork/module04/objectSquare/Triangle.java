package com.goit.lessons.homeWork.module04.objectSquare;


public class Triangle implements Shape{
    @Override
    public double square(double... args) {
        double S = 1;
        for (double i : args){
            S = S*i;
        }
        return 0.5*S;
    }
}
