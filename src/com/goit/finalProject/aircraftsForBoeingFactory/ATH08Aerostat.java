package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Aerostat;

public class ATH08Aerostat implements Aerostat {
    public String getAircraftType(){
        return "Aerostat";
    };
    public Integer getSeatingCapacity(){
        return 13;
    };
    public String getVendorName(){
        return "Boeing";
    };
    public Integer getFuelEndurance(){
        return 15;
    };
    public Integer getWeightLift(){
        return 250;
    };
    public String getAircraftName(){
        return "08 ATH";
    };
    public Integer getGasCylinderVolume(){
        return 45;
    };
    public Integer getFlightAltitudes(){
        return 800;
    };
}
