package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeWithConstructor;

public class BoxMain {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        System.out.println("Box1 volume is:\n " + box1.boxVolume());
        System.out.println("Box1 volume is:\n" + box2.boxVolume());
    }
}
