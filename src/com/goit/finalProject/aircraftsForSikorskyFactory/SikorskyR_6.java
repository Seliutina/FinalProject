package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Helicopter;

public class SikorskyR_6 implements Helicopter{
    public String getAircraftName(){
        return "Sikorsky R-6";
    };
    public String getVendorName(){
        return "Sikorsky";
    };
    public Integer getFuelEndurance(){
        return 65;
    };
    public Integer getLengthMorphingHelicopterRotor(){
        return 20;
    };
    public String getAircraftType(){
        return "Helicopter";
    };
    public Integer  getFlyingRange(){
        return 800;
    };
    public Integer getSeatingCapacity(){
        return 7;
    };
    public Integer getWeightLift(){
        return 650;
    };
}
