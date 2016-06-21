package com.goit.lessons.homeWork.additionalTasks;

/*
Array's size should be more than 1 to correct code work
 */
public class SecondLargestArrayValue {

    public int secondLargest(int[] intArray) {

        int max = intArray[0];
        int secondMax = intArray[1];

        for (int i = 0; i < intArray.length; i++) {

                if (max < intArray[i]) {
                    max = intArray[i];
                }

                for (int j = 0; j < intArray.length; j++) {
                    if (secondMax == max){
                        secondMax = intArray[j];
                    }
                }
            if (intArray[i] > secondMax & intArray[i] < max){
                secondMax = intArray[i];
            }
        }
        return secondMax;
    }

    public int[] arrays() {

                int[] array = {8, 8, 8, 1, 8, 8};
                for (int i = 0; i < array.length; i++) {
                    System.out.print("  " + array[i]);
                }
        System.out.println();
        return array;
    }

    public static void main(String args[]) {

        SecondLargestArrayValue secondLargestArrayValue = new SecondLargestArrayValue();

        System.out.println("Second max value in the array is: " +
                secondLargestArrayValue.secondLargest(secondLargestArrayValue.arrays()));
    }
}



