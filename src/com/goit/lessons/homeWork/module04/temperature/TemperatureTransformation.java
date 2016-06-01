package com.goit.lessons.homeWork.module04.temperature;


public class TemperatureTransformation {

    public static void main(String[] args) {

        CelsiusScale celsiusScale = new CelsiusScale(0);
        FahrenheitScale fahrenheitScale = new FahrenheitScale(212);

        System.out.println(celsiusScale.getTmp() + " by Celsius is " +
                + (celsiusScale.getTmp()*1.8+32) + " by Fahrenheit");
        System.out.println(fahrenheitScale.getTmp() + " by Fahrenheit is " +
                + (fahrenheitScale.getTmp()-32)/1.8 + " by Celsius");
    }
}