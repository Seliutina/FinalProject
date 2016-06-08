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
    public static void shakerSort(int[] array){
        int left = 0;
        int right = array.length - 1;

        do
        {
            for (int i = left; i < right; i++) {
                if(array[i] > array[i+1]) {
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
            right--;
            for (int i = right; i > left ; i--) {
                if(array[i] < array[i-1]) {
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                }
            }
            left++;
        } while (left <= right);

        System.out.println("Sorted array is: ");

        for (int i : array)
            System.out.print(i + " ");
    }
}