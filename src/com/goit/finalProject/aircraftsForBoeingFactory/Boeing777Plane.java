package com.goit.finalProject.aircraftsForBoeingFactory;


import com.goit.finalProject.Plane;

public class Boeing777Plane implements Plane {
    public String getAircraftType(){
        return "Plane";
    };
    public String getAircraftName(){
        return "Boeing 777";
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 450;
    };
    public Integer  getFlyingRange(){
        return 35000;
    };
    public Integer getWeightLift(){
        return 10000;
    };
    public Integer getSeatingCapacity(){
        return 550;
    };
    public String getPlaneType(){
        return "Passenger";
    };
}
