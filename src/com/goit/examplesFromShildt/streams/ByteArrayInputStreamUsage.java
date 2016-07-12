package com.goit.examplesFromShildt.streams;

import java.io.ByteArrayInputStream;

import static java.lang.System.in;
import static java.lang.System.setOut;

/*
 p. 735
 */
public class ByteArrayInputStreamUsage {
    public static void main(String[] args) throws Exception{
        String string = "abc";//defghijklmnopqrstuvwxyz
        byte[] bytes = string.getBytes();

        ByteArrayInputStream stream1 = new ByteArrayInputStream(bytes);

        for (int i = 0; i < 2; i++){
            int c;
            while ((c = stream1.read())!= -1 ){
                if (i == 0){
                    System.out.println((char) c);
                }
                System.out.println();
            }
        }
    }
}
