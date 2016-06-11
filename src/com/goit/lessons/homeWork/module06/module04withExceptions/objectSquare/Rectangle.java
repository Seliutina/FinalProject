package com.goit.lessons.homeWork.module06.module04withExceptions.objectSquare;

public class Rectangle implements Shape, AutoCloseable {

    public void close () throws Exception{};

    @Override
    public void square(double... args) throws IllegalArgumentException{
        double S = 1;
        for(double i : args){
            if (i < 0) {
                throw new IllegalArgumentException("Some rectange side value is negative");
            }
            S = S*i;
        }
        System.out.println("Rectangle square is " + S);
    }
}
