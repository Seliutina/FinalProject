package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeWithConstructorWithParameters;

public class Box {
    double height;
    double weight;
    double depth;

    Box(double height, double weight, double depth){
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    double boxVolume (){
        return height*weight*depth;
    }
}
