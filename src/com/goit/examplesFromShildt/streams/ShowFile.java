package com.goit.examplesFromShildt.streams;
/*
* p.366
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws Exception {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("File tmp.txt is used");
            return;
        }

        try {
             fin = new FileInputStream(args[0]);

        }catch(FileNotFoundException e){
            System.out.println("tmp.txt file not found or can't be opened");
        }
        try{
            do {
                i = fin.read();
                if(fin.read()!= -1){
                    System.out.println((char) i);
                }
            }
            while (fin.read()!= -1);
        }catch (IOException e){
            System.out.println("read file error");
        }
        try{
            fin.close();
        }catch (IOException e){
            System.out.println("file close error");
        }
    }
}
