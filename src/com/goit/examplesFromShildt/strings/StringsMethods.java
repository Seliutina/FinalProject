package com.goit.examplesFromShildt.strings;

public class StringsMethods {

    public static void main(String args[]){
    String string = new String("Hello, world!!");
        String str[] = {"one", "two", "three"};
        System.out.println(string.length() + " " + string.charAt(13)); //take string element by index
        System.out.println();
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]); // output string array elements
        }
    }
}
