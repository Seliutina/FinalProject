package com.goit.lessons.homeWork.module06.module05withExceptions;


public class ActionWithArray {
    public static void minElement(int array[]) {
        int min = array[0];
        for (int i =0 ; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("MIN VALUE IN THE ARRAY IS " + min);
        System.out.println();
    }
    public static void maxElement(int array[]){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println();
            System.out.println("MAX VALUE IN THE ARRAY IS " + max);
            System.out.println();
    }

    public static void shakerSort(int[] array) {
            int left = 0;
            int right = array.length - 1;

            do {
                for (int i = left; i < right; i++) {
                    if (array[i] > array[i + 1]) {
                        int tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                    }
                }
                right--;
                for (int i = right; i > left; i--) {
                    if (array[i] < array[i - 1]) {
                        int tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;
                    }
                }
                left++;
            } while (left <= right + 1);

            System.out.println();
            System.out.println("SORTED ARRAY IS: ");
            System.out.println();

            for (int i : array)
                System.out.print(i + "  ");
            System.out.println();
        }

}
