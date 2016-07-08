package com.goit.anotherExamples.readTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        String s ;//string to read
        int i = 0;//string counting
        try{
           BufferedReader in = new BufferedReader(new FileReader("tmp.txt"));
            while ((s = in.readLine()) != null)//reading
            {
                ++i; //increase string were reading
                System.out.println(s);
            }
            in.close();
        }
        catch (IOException e){
            System.out.println("[ERROR]");
        }
        System.out.println(+i);
    }
}
