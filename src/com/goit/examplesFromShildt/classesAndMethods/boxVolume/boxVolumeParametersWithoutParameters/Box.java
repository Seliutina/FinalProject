package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeParametersWithoutParameters;

public class Box {

    double height;
    double weight;
    double depth;

    public double volume(){
        double volume = height*weight*depth; //Box class object is not created, we use variables from the same class
        return volume;
    }

}
