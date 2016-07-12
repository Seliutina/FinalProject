package com.goit.examplesFromShildt.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * p.360
 */
public class BufferedReaderUsageToReadSymbolsFromConsole {
    public static void main(String[] args) throws Exception{
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input symbols, q - quit");

        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        }
        while (c!= 'q');
    }
}
