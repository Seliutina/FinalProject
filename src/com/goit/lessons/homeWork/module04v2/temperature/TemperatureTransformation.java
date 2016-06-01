package com.goit.lessons.homeWork.module04v2.temperature;

/**
 * Created by Оксана on 01.06.2016.
 */
public class TemperatureTransformation {
    public static void main(String[] args){
        System.out.println("by Fehrenheit "+ CelsiusScale.celsiosToFahrenheit(0));
        System.out.println("by Celsius " + FahrenheitScale.fahrenheitToCelsius(32));
    }
}
