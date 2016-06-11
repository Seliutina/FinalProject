package com.goit.lessons.homeWork.module04.distanceBetweenPoints;

import java.lang.Math;

public class DistanceBetweenCoordinates {

    public static void main(String[] args){

        Coordinates firstCoordinates = new Coordinates(9, 0);
        Coordinates secondCoordinates = new Coordinates(1, 0);

        double distance = Math.sqrt(Math.pow((secondCoordinates.getX()- firstCoordinates.getX()),2) +
                + Math.pow(secondCoordinates.getY()- firstCoordinates.getY(), 2));

        System.out.println("Distance between coordinates is " + distance);
    }
}

