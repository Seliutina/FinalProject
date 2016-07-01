package com.goit.anotherExamples.equationSystem;

public class Systems {
    private double x;
    private double y;

    void functionSolution(double x){
        this.x = x;

        if (x < -5){
            y = x -1;
            System.out.println("y = " + y);
        }

        if (x >= 5){
            y = Math.pow(x,2) + 2;
            System.out.println("y = " + y);
        }

        else System.out.println("function has not solution for this x");
    }
}
