package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Plane;

public class SikorskyS_44Plane implements Plane {
    public String getAircraftType(){
        return "Plane";
    };
    public String getAircraftName(){
        return "Sikorsky S-44";
    };
    public String getVendorName(){
        return "Sikorsky";
    };
    public Integer getFuelEndurance(){
        return 190;
    };
    public Integer  getFlyingRange(){
        return 350;
    };
    public Integer getWeightLift(){
        return 12500;
    };
    public Integer getSeatingCapacity(){
        return 170;
    };
    public String getPlaneType(){
        return "Passenger";
    };
}
