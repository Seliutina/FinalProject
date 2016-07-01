package com.goit.examplesFromShildt.collections.arrayListToArray;
/*There are two methods
OЬject[] toArray[]
<Т> Т[] toArray (Т array[])
 */


import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);//автоматическая упаковка - примитив приводится к классу Integer
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("ArrayList is " + al);

        Integer array[] = new Integer[al.size()];
        array = al.toArray(array);//array with int elements
        int sum = 0;
        for (int i = 0; i <= array.length; i++){
            sum +=i;
        }
        System.out.println("Array's elements sum is " + sum);
    }



}
