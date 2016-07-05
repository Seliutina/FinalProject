package com.goit.examplesFromShildt.strings;
/*page 471
String (Ьуtе symbols[] )
String (Ьyte symbols[] , int initial_index , int symbols_quantity)
*/

public class SubStringCons {
    public static void main(String[] args) {
        byte ascii[] = {66, 65, 67};
        String str = new String(ascii);
        System.out.println(str);

        System.out.println();

        String Digit = "0123456789";
        for(int i =0; i < Digit.length(); i++){
            char currentChar = Digit.charAt(i);
            System.out.println(Character.isDigit(currentChar));
            int index = Digit.indexOf(currentChar);
            System.out.println("current char: " + currentChar + " index: " + index);
        }

    }
}
