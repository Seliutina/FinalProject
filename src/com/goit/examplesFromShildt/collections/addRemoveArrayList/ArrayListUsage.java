package com.goit.examplesFromShildt.collections.addRemoveArrayList;

import java.util.ArrayList;

public class ArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("initial ArrayList size is = " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println(al);//toStirng() method is used to display collection, extends AbstractCollection Class

        al.remove("A");
        System.out.println(al);
        System.out.println();
        System.out.println("This List element will be deleted - " + al.remove(2));
        System.out.println("ArrayList after remove(2)" + al);
    }
}
