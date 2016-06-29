package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeMethodsWithParameters;

public class BoxMain {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        System.out.println("Box1 volume is: " + box1.boxVolume(10,10,10));
        System.out.println("Box1 volume is: " + box2.boxVolume(5, 5, 5));

    }
}
