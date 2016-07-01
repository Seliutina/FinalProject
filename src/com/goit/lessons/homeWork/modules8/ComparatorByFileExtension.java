package com.goit.lessons.homeWork.modules8;

import com.goit.lessons.homeWork.module03.FileSystem.File;

import java.util.Comparator;

public class ComparatorByFileExtension implements Comparator<File>{
    public int compare(File a, File b){
        return a.getFileExtension().compareTo(b.getFileExtension());
    }
}
