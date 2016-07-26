package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Aerostat;

public class ATC07Aerostat implements Aerostat {
    public String getAircraftType(){
        return "Aerostat";
    };
    public Integer getSeatingCapacity(){
        return 20;
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 20;
    };
    public Integer getWeightLift(){
        return 300;
    };
    public String getAircraftName(){
        return "07 ATC";
    };
    public Integer getGasCylinderVolume(){
        return 50;
    };
    public Integer getFlightAltitudes(){
        return 600;
    };
}
