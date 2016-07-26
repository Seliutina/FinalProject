package com.goit.finalProject;

import com.goit.finalProject.aircraftsForSikorskyFactory.*;

import java.util.ArrayList;
import java.util.List;

public class SikorskyAircraftCreationFactory implements AircraftCreationAbstractFactory{
    @Override
    public List<Plane> createPlane(String sikorskyPlanName, int quantity){
        Plane plane = null;
        List<Plane> sikorskyPlaneOrder = new ArrayList<>();
        if (sikorskyPlanName.equalsIgnoreCase("Sikorsky S-44")) {
            for (int i = 0; i < quantity; i++) {
                plane = new SikorskyS_44Plane();
                sikorskyPlaneOrder.add(plane);
            }
        }
        if (sikorskyPlanName.equalsIgnoreCase("Sikorsky S-52")) {
            for (int i = 0; i <quantity; i++){
                plane = new SikorskyS_52Plane();
                sikorskyPlaneOrder.add(plane);
            }
        }
        return sikorskyPlaneOrder;
    };
    @Override
    public List<Helicopter> createHelicopter(String sikorskyHelicopterName, int quantity){
        Helicopter helicopter = null;
        List<Helicopter> sikorskyHelicopterOrder = new ArrayList<>();
        if (sikorskyHelicopterName.equalsIgnoreCase("Sikorsky R-6")) {
            for (int i = 0; i < quantity; i++){
                helicopter = new SikorskyR_6();
                sikorskyHelicopterOrder.add(helicopter);
            }
        }
        if (sikorskyHelicopterName.equalsIgnoreCase("Sikorsky SH-3")) {
            for (int i = 0; i < quantity; i++){
                helicopter = new SikorskySH_3();
                sikorskyHelicopterOrder.add(helicopter);
            }
        }
        return sikorskyHelicopterOrder;
    };
}
