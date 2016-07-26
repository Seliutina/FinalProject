package com.goit.finalProject;

import com.goit.finalProject.aircraftsForBoeingFactory.*;
import java.util.ArrayList;
import java.util.List;

public class BoeingAircraftCreationFactory implements AircraftCreationAbstractFactory {

    @Override
    public List<Plane> createPlane(String boeingPlanName, int quantity){
        Plane plane = null;
        List<Plane> boeingPlaneList = new ArrayList<>();
        if (boeingPlanName.equalsIgnoreCase("Boeing 737")) {
            for (int i = 0; i <quantity; i++) {
                plane = new Boeing737Plane();
                boeingPlaneList.add(plane);
            }
        }
        if (boeingPlanName.equalsIgnoreCase("Boeing 777")) {
            for (int i = 0; i <quantity; i++) {
                plane = new Boeing777Plane();
                boeingPlaneList.add(plane);
            }
        }
        return boeingPlaneList;
    }
    @Override
    public List<Helicopter> createHelicopter(String boeingHelicopterName, int quantity){
        Helicopter helicopter = null;
        List<Helicopter> boeingHelicopterList = new ArrayList<>();
        if (boeingHelicopterName.equalsIgnoreCase("Bell 47")) {
            for (int i = 0; i < quantity; i++){
                helicopter = new Bell47();
                boeingHelicopterList.add(helicopter);
            }
        }
        if (boeingHelicopterName.equalsIgnoreCase("Bell AH-1 Cobra")) {
            for (int i = 0; i < quantity; i++){
                helicopter = new BellAH_1Cobra();
                boeingHelicopterList.add(helicopter);
            }
        }
        return boeingHelicopterList;
    };
    public List<Aerostat> crateAerostat(String boeingAerostatName, int quantity){
        Aerostat aerostat = null;
        List<Aerostat> boeingAerostatList = new ArrayList<>();
        if (boeingAerostatName.equalsIgnoreCase("07 ATC")) {
            for (int i = 0; i < quantity; i++){
                aerostat = new ATC07Aerostat();
                boeingAerostatList.add(aerostat);
            }
        }
        if (boeingAerostatName.equalsIgnoreCase("08 ATH")) {
            for (int i = 0; i < quantity; i++){
                aerostat = new ATH08Aerostat();
                boeingAerostatList.add(aerostat);
            }
        }
        return boeingAerostatList;
    }
}