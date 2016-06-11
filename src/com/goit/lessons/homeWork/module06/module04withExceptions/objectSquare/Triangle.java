package com.goit.lessons.homeWork.module06.module04withExceptions.objectSquare;


public class Triangle implements Shape, AutoCloseable {

    public void close () throws Exception{};

    @Override
    public void square(double... args) throws IllegalArgumentException{
        double S = 1;
        for (double i : args) {
            S = S * i;

            if (i < 0) {
                throw new IllegalArgumentException("Some triangle side value is negative");
            }
        }
            System.out.println("Triangle square is " + 0.5*S);
        }


}
