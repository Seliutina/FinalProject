package com.goit.examplesFromShildt.strings.toStringOverride;

public class ToStringMothodOverrideMain {
    public static void main(String[] args) {
        Box box = new Box(2, 5, 6);
        String stirng = "Dementions are: " + box;

        System.out.println(box);
        System.out.println(stirng);
    }
}
