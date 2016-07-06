package com.goit.examplesFromShildt.strings;

/**
 * p.476
 *  void getChars(int source_start, int source_end, char[] receiver, int receiver_start )
 */
public class GetCharsMethod {
    public static void main(String[] args) {
        String s = "This getChars method work demonstration";
        int source_start = 5;
        int source_end = 13;
        char[] receiver = new char[source_end - source_start];
        "This getChars method work demonstration".
                getChars(source_start, source_end, receiver, 0 );
        System.out.println("Receiver contains:");
        for (int i = 0; i < receiver.length; i++){
            System.out.print(receiver[i]);
        }

    }
}
