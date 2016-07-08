package com.goit.anotherExamples.fileWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws Exception{


        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tmp.txt")));
            out.println("Hello, file!!!! I'm here!!!");
            out.println("Second line in the text file :)");
            out.println(":))))))))))))))))))))))))))))");
            out.close();
        }catch (IOException e){
            System.out.println("[ERROR]: Unfortunately IOException is occurred :( ");
        }
    }
}
