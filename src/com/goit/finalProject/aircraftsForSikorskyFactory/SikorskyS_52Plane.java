package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Plane;
import com.goit.finalProject.parser.InitialValuesParser;

import java.util.Map;

public class SikorskyS_52Plane implements Plane {
    private static String AircraftType;
    private static String VendorName;
    private static String PlaneName;
    private static String PlaneType;
    private static Integer SeatingCapacity;
    private static Integer FuelEndurance;
    private static Integer FlyingRange;
    private static Integer WeightLift;

    static {

        try {
            InitialValuesParser initialValuesParser = new InitialValuesParser();
            for (Object o : initialValuesParser.sikorskyS52PlaneInitialValues().entrySet()) {
                Map.Entry entry = (Map.Entry) o;
                if (entry.getKey().toString().equalsIgnoreCase("aircraftType")){
                    AircraftType = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("vendorName")){
                    VendorName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("planeName")) {
                    PlaneName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("planeType")){
                    PlaneType = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("FuelEndurance")){
                    FuelEndurance = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("SeatingCapacity")){
                    SeatingCapacity = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("FlyingRange")){
                    FlyingRange = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("WeightLift")){
                    WeightLift = Integer.parseInt(entry.getValue().toString());
                }
            }
        } catch (Exception e) {
            System.err.println("[ERROR]:");
        }
    }
    public String getAircraftType(){
        return AircraftType;
    };
    public String getAircraftName(){
        return PlaneName;
    };
    public String getPlaneType(){
        return PlaneType;
    };
    public String getVendorName(){
        return VendorName;
    };
    public Integer getFuelEndurance(){
        return FuelEndurance;
    };
    public Integer getFlyingRange(){
        return FlyingRange;
    };
    public Integer getWeightLift(){
        return WeightLift;
    };
    public Integer getSeatingCapacity(){
        return SeatingCapacity;
    };
}

