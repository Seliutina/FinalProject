package com.goit.lessons.homeWork.module06.module04withExceptions.objectSquare;


public class Circle implements Shape, AutoCloseable{

    public void close() throws Exception {};

    @Override
    public void square(double... args) throws IllegalArgumentException{
        double S = 1;
        for (double i : args){
            if(i < 0 ){
                throw new IllegalArgumentException("Radius value is negative");
            }
            S = Math.pow(i, 2)*Math.PI;
        }

        System.out.println("Circle square is " + S);
    }
}

