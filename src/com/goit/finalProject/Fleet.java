package com.goit.finalProject;

import com.goit.finalProject.parser.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Fleet {
    public static List<Plane>  createAllBoeingPlanOrder() throws Exception{
        BoeingAircraftCreationFactory boeingAircraftCreationFactory =
                new BoeingAircraftCreationFactory();
        List<Plane> planeList = new ArrayList<>();
        Parser parserAgain = new Parser();

        for (Object o : parserAgain.boeingPlanOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            planeList.addAll(boeingAircraftCreationFactory.createPlane
                    (entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }//create List<List<Plane>> list of all boeing plan in the order
        return planeList;
    }
    public static List<Helicopter> createAllBoeingHelicopterOrder() throws Exception{
        Parser parserAgain = new Parser();
        BoeingAircraftCreationFactory boeingAircraftCreationFactory =
                new BoeingAircraftCreationFactory();
        List<Helicopter> helicopterList = new ArrayList<>();

        for (Object o : parserAgain.boeingHelicopterOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            helicopterList.addAll(boeingAircraftCreationFactory.
                    createHelicopter(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return helicopterList;
    }
    public static List<Aerostat> createAllBoeingAerostat() throws Exception{
        Parser parserAgain = new Parser();
        BoeingAircraftCreationFactory boeingAircraftCreationFactory =
                new BoeingAircraftCreationFactory();
        List<Aerostat> aerostatList = new ArrayList<>();

        for (Object o : parserAgain.boeingAerostatOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            aerostatList.addAll(boeingAircraftCreationFactory.
                    crateAerostat(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return aerostatList;
    }
    public static List<Plane> createAllSikorskyPlanOrder() throws Exception{
        Parser parserAgain = new Parser();
        SikorskyAircraftCreationFactory sikorskyAircraftCreationFactory =
                new SikorskyAircraftCreationFactory();
        List<Plane> planeList = new ArrayList<>();

        for (Object o : parserAgain.sikorskyPlanOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            planeList.addAll(sikorskyAircraftCreationFactory.
                    createPlane(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return planeList;
    }
    public static List<Helicopter> createAllSikorskyHelicopterOrder() throws Exception{
        Parser parserAgain = new Parser();
        SikorskyAircraftCreationFactory sikorskyAircraftCreationFactory =
                new SikorskyAircraftCreationFactory();
        List<Helicopter> helicopterList= new ArrayList<>();

        for (Object o : parserAgain.sikorskyHelicopterOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            helicopterList.addAll(sikorskyAircraftCreationFactory.
                    createHelicopter(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return helicopterList;
    }

    public static List<Aircraft> commonFleet() throws Exception{
        List<Plane> planeList, planeListSikorsky;
        List<Helicopter> boeingHelicopterList, sikorskyHelicopterList;
        List<Aerostat> boeingAerostatList;
        List<Aircraft> aircraftList = new ArrayList<>();

        planeList = createAllBoeingPlanOrder();
        planeListSikorsky = createAllSikorskyPlanOrder();
        boeingHelicopterList = createAllBoeingHelicopterOrder();
        sikorskyHelicopterList = createAllSikorskyHelicopterOrder();
        boeingAerostatList = createAllBoeingAerostat();

        aircraftList.addAll(planeList);
        aircraftList.addAll(planeListSikorsky);
        aircraftList.addAll(boeingHelicopterList);
        aircraftList.addAll(boeingAerostatList);
        aircraftList.addAll(sikorskyHelicopterList);
        System.out.println("PLANES, AEROSTATS AND HELICOPTERS FROM SIKORSKY AND BOEING VENDORS ARE: ");
        for (Aircraft anAircraftList : aircraftList) {
            System.out.println("AIRCRAFT TYPE " + anAircraftList.getAircraftType() + " "
                    + "NAME " + anAircraftList.getAircraftName() + " "
                    + "VENDOR " + anAircraftList.getVendorName());
        }
        return aircraftList;
    }
  ///тут еще не работает правильно ничего
    public static void main(String[] args) throws Exception{
        List<Aircraft> aircraftList = commonFleet();
        aircraftList.addAll(commonFleet());
        for (Aircraft anAircraftList : aircraftList) {
            System.out.println("AIRCRAFT TYPE " + anAircraftList.getAircraftType() + " "
                    + "NAME " + anAircraftList.getAircraftName() + " "
                    + "VENDOR " + anAircraftList.getVendorName());
        }
        System.out.println(aircraftList.size());
    }
}
