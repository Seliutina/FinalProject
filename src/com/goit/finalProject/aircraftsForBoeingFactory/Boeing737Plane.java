package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Plane;

public class Boeing737Plane implements Plane {
   public String getAircraftType(){
       return "Plane";
   };
    public String getAircraftName(){
        return "Boeing 737";
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 300;
    };
    public Integer  getFlyingRange(){
        return 5000;
    };
    public Integer getWeightLift(){
        return 15000;
    };
    public Integer getSeatingCapacity(){
      return 470;
    };
    public String getPlaneType(){
        return "Passenger";
    };
}
