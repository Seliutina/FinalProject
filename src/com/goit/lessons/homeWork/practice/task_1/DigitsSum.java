package com.goit.lessons.homeWork.practice.task_1;

public class DigitsSum {
    public void digitsSum (int k){
        StringBuilder stringBuilder = new StringBuilder(0);
        stringBuilder = stringBuilder.append(stringBuilder.toString().valueOf(k));
        int n = 0;
        for (int i = 0; i < stringBuilder.length(); i++){
            Character.getNumericValue(stringBuilder.charAt(i));
            n += Character.getNumericValue(stringBuilder.charAt(i));
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.digitsSum(235384295);
    }
}
