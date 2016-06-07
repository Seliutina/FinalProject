package com.goit.lessons.homeWork.module05;


public class ActionWithArray {
    public static void minElement (int array[]){
        int min = array[0];
        for (int i =0 ; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Min value in the array is " + min);
    }
    public static void maxElement(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max value in the array is " + max);
    }
}