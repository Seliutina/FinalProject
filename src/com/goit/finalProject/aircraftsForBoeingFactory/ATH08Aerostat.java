package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Aerostat;
import com.goit.finalProject.parser.InitialValuesParser;

import java.util.Map;

public class ATH08Aerostat implements Aerostat {
    private static String AircraftType;
    private static String VendorName;
    private static String AircraftName;
    private static Integer SeatingCapacity;
    private static Integer FuelEndurance;
    private static Integer WeightLift;
    private static Integer GasCylinderVolume;
    private static Integer FlightAltitudes;

    static {

        try {
            InitialValuesParser initialValuesParser = new InitialValuesParser();
            for (Object o : initialValuesParser.boeingATH08AerostatInitialValues().entrySet()) {
                Map.Entry entry = (Map.Entry) o;
                if (entry.getKey().toString().equalsIgnoreCase("aircraftType")){
                    AircraftType = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("vendorName")){
                    VendorName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("aerostatName")) {
                    AircraftName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("gasCylinderVolume")){
                    GasCylinderVolume = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("FuelEndurance")){
                    FuelEndurance = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("SeatingCapacity")){
                    SeatingCapacity = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("FlightAltitudes")){
                    FlightAltitudes = Integer.parseInt(entry.getValue().toString());
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
    public Integer getSeatingCapacity(){
        return SeatingCapacity;
    };
    public String getVendorName(){
        return VendorName;
    };
    public Integer getFuelEndurance(){
        return FuelEndurance;
    };
    public Integer getWeightLift(){
        return WeightLift;
    };
    public String getAircraftName(){
        return AircraftName;
    };
    public Integer getGasCylinderVolume(){
        return GasCylinderVolume;
    };
    public Integer getFlightAltitudes(){
        return FlightAltitudes;
    };
}
