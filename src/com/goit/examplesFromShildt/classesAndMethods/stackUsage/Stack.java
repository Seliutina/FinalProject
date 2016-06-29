package com.goit.examplesFromShildt.classesAndMethods.stackUsage;

public class Stack {
    int stck[] = new int[30];//stack as int array
    int tos; //top of stack pointer

    Stack(){
        tos = -1; //top of stack pointer initialization
    }

    void pushStack(int i){
        if (tos == 29){
            System.out.println("stack is full");
        }
        else stck[++tos] = i;
    }

    int popStack(){
        if (tos == -1){
            System.out.println("stack is empty");
            return 0;
        }
        else return stck[tos--];
    }
}
