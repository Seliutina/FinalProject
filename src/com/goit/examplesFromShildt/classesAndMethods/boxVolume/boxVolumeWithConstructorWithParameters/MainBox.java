package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeWithConstructorWithParameters;

public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box(2,2,2);
        Box box2 = new Box(3,3,3);

        System.out.println("Box1 volume is: " + box1.boxVolume());
        System.out.println("Box2 volume is: " + box2.boxVolume());
    }
}
