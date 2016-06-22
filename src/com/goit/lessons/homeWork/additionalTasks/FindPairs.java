package com.goit.lessons.homeWork.additionalTasks;

public class FindPairs {

    public void findPairs(int[] intArray,int target){

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {
                if((intArray[i] + intArray[j]) == target){
                    System.out.println(intArray[i] + " " + intArray[j]);
                    System.out.println();
                }
            }
        }
    }

    public int[] array(){
        int[] array = {5, 6, 12, 78, -1};
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
        System.out.println();
        return array;
    }

    public static void main (String args[]) {

        FindPairs findPairs = new FindPairs();

        findPairs.findPairs(findPairs.array(), 11);
    }
}
