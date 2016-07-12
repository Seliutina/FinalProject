package com.goit.examplesFromShildt.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * p.361
 * Strinq readLine ( ) throws IOException
 */
public class ReadLineMethod {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        System.out.println("Input text strings.");
        System.out.println("Input 'stop' to quit." );

        do{
            string = bufferedReader.readLine();
            System.out.println(string);
        }
        while(!string.equals("stop"));
    }
}
