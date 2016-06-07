package com.goit.lessons.homeWork.module04.distanceBetweenPoints;

import java.lang.Math;

public class DistanceBetweenCoordinates {

    public static void main(String[] args){

        FirstCoordinate firstCoordinate = new FirstCoordinate(2, 0);
        FirstCoordinate secondCoordinate = new FirstCoordinate(1, 0);

        double distance = Math.sqrt(Math.pow((secondCoordinate.getX()-firstCoordinate.getX()),2) +
                + Math.pow(secondCoordinate.getY()-firstCoordinate.getY(), 2));

        System.out.println("Distance between coordinates is " + distance);
    }
}

