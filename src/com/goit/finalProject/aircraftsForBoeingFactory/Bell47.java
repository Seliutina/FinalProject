package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Helicopter;

public class Bell47 implements Helicopter {
    public String getAircraftName(){
        return "Bell 47";
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 100;
    };
    public Integer getLengthMorphingHelicopterRotor(){
        return 21;
    };
    public String getAircraftType(){
        return "Helicopter";
    };
    public Integer  getFlyingRange(){
        return 500;
    };
    public Integer getSeatingCapacity(){
        return 3;
    };
    public Integer getWeightLift(){
        return 500;
    };
}
