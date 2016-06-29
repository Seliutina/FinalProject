package com.goit.examplesFromShildt.classesAndMethods.stackUsage;

public class StackUsage {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 1; i < 23; i++ ) {
            stack1.pushStack(i);
        }
        for (int i = 1; i < 20; i++){
            stack2.pushStack(i);
        }

        System.out.println("Stack1: ");
        for (int i = 1; i < 23; i++){
            System.out.println(stack1.popStack());
        }
        System.out.println("Stack2: ");
        for (int i = 1; i < 20; i++ ) {
            System.out.println(stack2.popStack());
        }
    }
}
