package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Plane;

public class SikorskyS_52Plane implements Plane {
    public String getAircraftType(){
        return "Plane";
    };
    public String getAircraftName(){
        return "Sikorsky S-53";
    };
    public String getVendorName(){
        return "Sikorsky";
    };
    public Integer getFuelEndurance(){
        return 175;
    };
    public Integer  getFlyingRange(){
        return 390;
    };
    public Integer getWeightLift(){
        return 11500;
    };
    public Integer getSeatingCapacity(){
        return 150;
    };
    public String getPlaneType(){
        return "Passenger";
    };
}
