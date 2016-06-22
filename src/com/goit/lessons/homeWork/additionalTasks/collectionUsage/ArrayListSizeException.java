package com.goit.lessons.homeWork.additionalTasks.collectionUsage;

public class ArrayListSizeException extends RuntimeException{

    public ArrayListSizeException() {
        super("ArrayList size 0 or 1, should be more than 1");
    }
}
