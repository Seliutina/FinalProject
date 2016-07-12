package com.goit.examplesFromShildt.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * p. 362
 */
public class TextRedactor {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = new String[100];
        System.out.println("Input text strings.");
        System.out.println("Input 'stop' to quit.");
        for (int i = 0; i <string.length; i++){
            string[i] = bufferedReader.readLine();
            if (string[i].equals("stop")){
                break;
            }
        }
        System.out.println("YOUR BUFFER CONTAINS: ");
        for (int i = 0; i < string.length; i++){
            if (string[i].equals("stop")){
                break;
            }
            System.out.println(string[i]);
        }

    }
}
