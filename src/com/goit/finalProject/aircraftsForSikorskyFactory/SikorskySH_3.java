package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Helicopter;

public class SikorskySH_3 implements Helicopter{
    public String getAircraftName(){
        return "Sikorsky SH-3";
    };
    public String getVendorName(){
        return "Sikorsky";
    };
    public Integer getFuelEndurance(){
        return 70;
    };
    public Integer getLengthMorphingHelicopterRotor(){
        return 15;
    };
    public String getAircraftType(){
        return "Helicopter";
    };
    public Integer  getFlyingRange(){
        return 600;
    };
    public Integer getSeatingCapacity(){
        return 4;
    };
    public Integer getWeightLift(){
        return 700;
    };
}
