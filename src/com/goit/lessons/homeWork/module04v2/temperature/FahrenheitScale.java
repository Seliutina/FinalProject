package com.goit.lessons.homeWork.module04v2.temperature;

/**
 * Created by Оксана on 01.06.2016.
 */
public class FahrenheitScale {
    public static double fahrenheitToCelsius(double tmp){
        double results = (tmp-32)/1.8;
        return results;
    }
}
