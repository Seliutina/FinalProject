package com.goit.examplesFromShildt.strings.stringConstructors;
/**
 * p. 471
 * String string = new String(chr[])
 */
public class CharConstructor {
    public static void main(String[] args) {
        char[] c = {'J','a','v','a'};
        String string1 = new String(c);
        String string2 = new String(string1);

        System.out.println("String1 is: " + string1);
        System.out.println("String2 is: " + string2);
    }
}
