package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeParametersWithoutParameters;

import com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeParametersWithoutParameters.Box;

public class MainBox {

    public static void main(String[] args) {
        Box box1 = new Box();//create Box class object, create copy of class Boz variables to access to Box variables and methods
        Box box2 = new Box();

        box1.depth = 10;
        box1.height = 12;
        box1.weight = 10;

        box2.depth = 11;
        box2.height = 10;
        box2.weight = 4;

        System.out.println("Box1 volume is: " + box1.volume());
        System.out.println();
        System.out.println("Box2 volume is: " + box2.volume());
    }
}
