package com.goit.finalProject;

import com.goit.finalProject.parser.InitialValuesParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        Controller controller = new Controller();
        controller.controller();

        InitialValuesParser initialValuesParser = new InitialValuesParser();
        for (Object o : initialValuesParser.boeing777InitialValues().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "" + entry.getValue().toString());
        }
        System.out.println();
        for (Object o : initialValuesParser.boeing737InitialValues().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "" + entry.getValue().toString());
        }
        }
    }

