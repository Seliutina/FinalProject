package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Helicopter;

public class BellAH_1Cobra implements Helicopter {
    public String getAircraftName(){
        return "Bell AH-1 Cobra";
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 90;
    };
    public Integer getLengthMorphingHelicopterRotor(){
        return 18;
    };
    public String getAircraftType(){
        return "Helicopter";
    };
    public Integer getFlyingRange(){
        return 800;
    };
    public Integer getSeatingCapacity(){
        return 5;
    };
    public Integer getWeightLift(){
        return 700;
    };
}
