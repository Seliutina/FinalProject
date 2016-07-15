package com.goit.lessons.homeWork.practice.task_1;
/*
current Capacity = previous Capacity * 2 + 2;
 */
public class DigitsMerger {
    public String merger(char[] A){
        StringBuilder string = new StringBuilder(0);
        for(int i = 0; i < A.length; i++){
            string = string.append(A[i]);
        }
        return string.toString();
    }

    public static void main(String[] args) {
         DigitsMerger digitsMerger = new DigitsMerger();
        char[] A = new char[] {'2', '3', '4', '0', '6'};
        System.out.println(digitsMerger.merger(A));
    }
}
