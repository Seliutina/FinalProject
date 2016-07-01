package com.goit.lessons.homeWork.modules8;

import com.goit.lessons.homeWork.module03.FileSystem.AudioFile;
import com.goit.lessons.homeWork.module03.FileSystem.File;
import com.goit.lessons.homeWork.module03.FileSystem.ImageFile;
import com.goit.lessons.homeWork.module03.FileSystem.TextFile;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionSortMain {
    public static void main(String[] args) {
        Comparator<File> comparatorByFileExtension =
                (new ComparatorByFileType()).thenComparing(new ComparatorByFileName()).
                        thenComparing(new ComparatorByFileExtension());

        TreeSet<File> treeSet = new TreeSet<>(comparatorByFileExtension);

        treeSet.add(new AudioFile("AudioFie", "Yesterday", ".mp3"));
        treeSet.add(new AudioFile("AudioFie", "Submarine", ".mp3"));
        treeSet.add(new TextFile("TextFile", "SomeBook", ".txt"));
        treeSet.add(new ImageFile("ImageFile", "SomePicture", ".png"));
        treeSet.add(new AudioFile("AudioFie", "SomeSing", ".mp3"));
        treeSet.add(new AudioFile("TextFile", "SomeArticle", ".txt"));

        for(File element: treeSet){
            System.out.println(element.getFileType() + " "
                + element.getName() + " "
                    + element.getFileExtension());
        }
    }
}
