package com.goit.finalProject.parser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public Map<String, Long> boeingPlanOrderPrepare() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;
        Map<String, Long> boeingPlanOrder = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Boeing")) {
                for (int j = 0; j < order.size(); j++) {
                    JSONObject jsonObject1 = (JSONObject) order.get(j);
                    if(((String)jsonObject1.get("aircraftType")).equalsIgnoreCase("Plane")) {
                        boeingPlanOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingPlanOrder;
    }
    public Map<String, Long> boeingHelicopterOrderPrepare() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;
        Map<String, Long> boeingHelicopterOrder = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Boeing")) {
                for (int j = 0; j < order.size(); j++) {
                    JSONObject jsonObject1 = (JSONObject) order.get(j);
                    if(((String)jsonObject1.get("aircraftType")).equalsIgnoreCase("Helicopter")) {
                        boeingHelicopterOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingHelicopterOrder;
    }
    public Map<String, Long> boeingAerostatOrderPrepare() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;
        Map<String, Long> boeingAerostatOrder = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Boeing")) {
                for (int j = 0; j < order.size(); j++) {
                    JSONObject jsonObject1 = (JSONObject) order.get(j);
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Aerostat")) {
                        boeingAerostatOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingAerostatOrder;
    }
    public Map<String, Long> sikorskyPlanOrderPrepare() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Long> sikorskyPlanOrder = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (int j = 0; j < order.size(); j++) {
                    JSONObject jsonObject1 = (JSONObject) order.get(j);
                    if(((String)jsonObject1.get("aircraftType")).equalsIgnoreCase("Plane")) {
                        sikorskyPlanOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return sikorskyPlanOrder;
    }
    public Map<String, Long> sikorskyHelicopterOrderPrepare() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Long> sikorskyHelicopterOrder = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (int j = 0; j < order.size(); j++) {
                    JSONObject jsonObject1 = (JSONObject) order.get(j);
                    if(((String)jsonObject1.get("aircraftType")).equalsIgnoreCase("Helicopter")) {
                        sikorskyHelicopterOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return sikorskyHelicopterOrder;
    }
}


