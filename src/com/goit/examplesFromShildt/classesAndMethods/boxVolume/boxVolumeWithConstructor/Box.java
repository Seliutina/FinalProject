package com.goit.examplesFromShildt.classesAndMethods.boxVolume.boxVolumeWithConstructor;

public class Box {
    double wight;
    double height;
    double depth;


    //Create Box constructor to define values
    Box(){
        wight = 10;
        height = 10;
        depth = 10;
    }
    double boxVolume(){
        return wight*height*depth;
    }
}
