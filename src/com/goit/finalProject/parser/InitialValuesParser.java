package com.goit.finalProject.parser;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

import java.util.HashMap;
import java.util.Map;

public class InitialValuesParser {
    public Map<String, Object> boeing777InitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("planes");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("planeName")).equalsIgnoreCase("Boeing 777")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Plane");
                        planesValues.put("planeName", jsonObject1.get("planeName"));
                        planesValues.put("planeType", jsonObject1.get("planeType").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("weightLift", jsonObject1.get("weightLift"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> boeing737InitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("planes");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("planeName")).equalsIgnoreCase("Boeing 737")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Plane");
                        planesValues.put("planeName", jsonObject1.get("planeName"));
                        planesValues.put("planeType", jsonObject1.get("planeType").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("weightLift", jsonObject1.get("weightLift"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> boeingBell47InitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("helicopters");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("helicopterName")).equalsIgnoreCase("Bell 47")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Helicopter");
                        planesValues.put("helicopterName", jsonObject1.get("helicopterName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("lengthMorphingHelicopterRotor", jsonObject1.get("lengthMorphingHelicopterRotor").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> boeingBellAHCobraInitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("helicopters");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("helicopterName")).equalsIgnoreCase("Bell AH - 1 Cobra")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Helicopter");
                        planesValues.put("helicopterName", jsonObject1.get("helicopterName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("lengthMorphingHelicopterRotor", jsonObject1.get("lengthMorphingHelicopterRotor").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> boeingATC07AerostatInitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("aerostats");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("aerostatName")).equalsIgnoreCase("07 ATC")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Aerostat");
                        planesValues.put("aerostatName", jsonObject1.get("aerostatName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("gasCylinderVolume", jsonObject1.get("gasCylinderVolume").toString());
                        planesValues.put("flightAltitudes", jsonObject1.get("flightAltitudes"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> boeingATH08AerostatInitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("aerostats");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("aerostatName")).equalsIgnoreCase("08 ATH")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Aerostat");
                        planesValues.put("aerostatName", jsonObject1.get("aerostatName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("gasCylinderVolume", jsonObject1.get("gasCylinderVolume").toString());
                        planesValues.put("flightAltitudes", jsonObject1.get("flightAltitudes"));

                    }
                }
            }

        }
        return planesValues;
    }

    public Map<String, Object> sikorskyS44PlaneInitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("planes");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("planeName")).equalsIgnoreCase("Sikorsky S - 44")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Plane");
                        planesValues.put("planeName", jsonObject1.get("planeName"));
                        planesValues.put("planeType", jsonObject1.get("planeType").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("weightLift", jsonObject1.get("weightLift"));

                    }
                }
            }

        }
        return planesValues;
    }
    public Map<String, Object> sikorskyS52PlaneInitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("planes");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("planeName")).equalsIgnoreCase("Sikorsky S - 52")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Plane");
                        planesValues.put("planeName", jsonObject1.get("planeName"));
                        planesValues.put("planeType", jsonObject1.get("planeType").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("weightLift", jsonObject1.get("weightLift"));

                    }
                }
            }

        }
        return planesValues;
    }
    public Map<String, Object> sikorskyR6InitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("helicopters");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("helicopterName")).equalsIgnoreCase("Sikorsky R - 6")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Helicopter");
                        planesValues.put("helicopterName", jsonObject1.get("helicopterName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("lengthMorphingHelicopterRotor", jsonObject1.get("lengthMorphingHelicopterRotor").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange"));

                    }
                }
            }

        }
        return planesValues;
    }
    public Map<String, Object> sikorskySH3InitialValues() throws Exception {
        JSONParser initialValuesParser = new JSONParser();
        Object object = initialValuesParser.parse(new FileReader("InitialValues"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Object> planesValues = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");

            JSONArray planes = (JSONArray) jsonObject.get("helicopters");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object plane : planes) {
                    JSONObject jsonObject1 = (JSONObject) plane;
                    if (((String) jsonObject1.get("helicopterName")).equalsIgnoreCase("Sikorsky SH - 3")) {
                        planesValues.put("vendorName", name);
                        planesValues.put("aircraftType", "Helicopter");
                        planesValues.put("helicopterName", jsonObject1.get("helicopterName"));
                        planesValues.put("weightLift", jsonObject1.get("weightLift").toString());
                        planesValues.put("fuelEndurance", jsonObject1.get("fuelEndurance").toString());
                        planesValues.put("seatingCapacity", jsonObject1.get("seatingCapacity").toString());
                        planesValues.put("lengthMorphingHelicopterRotor", jsonObject1.get("lengthMorphingHelicopterRotor").toString());
                        planesValues.put("flyingRange", jsonObject1.get("flyingRange"));

                    }
                }
            }

        }
        return planesValues;
    }
}