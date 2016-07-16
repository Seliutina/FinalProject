package com.goit.lessons.homeWork.practice.task_1;

public class OddNumber {
    public int oddNumber (int[] A){
        int k = 0;
        int counter = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i]%2 != 0){
                k = i;
                counter = counter + 1;
                break;
            }
        }
        if (counter != 0) {return k;}
        else {return -1;}
    }

    public static void main(String[] args) {
        OddNumber oddNumber = new OddNumber();
        int[] A = {10,4,8,8,4,2};
        System.out.println("The first odd number index in the array is " + oddNumber.oddNumber(A));
    }
}
