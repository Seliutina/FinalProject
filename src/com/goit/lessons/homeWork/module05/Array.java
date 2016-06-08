package com.goit.lessons.homeWork.module05;

import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
        ActionWithArray.minElement(fill());
        ActionWithArray.maxElement(fill());
        ActionWithArray.shakerSort(fill());

    }

    public static int[] fill() {
        int[] a = {0};
        Scanner input = new Scanner(System.in);
        System.out.println("To input array elements from keyboard enter K, to fill " +
                "array automatically enter A, to work with default array enter any other symbol/s");
        String choice = input.nextLine();

        switch (choice) {

            case "K":
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input array size: ");
                int size = scanner.nextInt();
                int arrayK[] = new int[size];
                for (int i = 0; i < arrayK.length; i++) {
                    System.out.println("Input array elements: ");
                    arrayK[i] = scanner.nextInt();
                }
                for (int i = 0; i < arrayK.length; i++) {
                    System.out.print("  " + arrayK[i]);
                    a = arrayK;

                }
                break;

            case "A":
                int[] arrayA = new int[10];
                for (int i = 0; i < arrayA.length; i++) {
                    arrayA[i] = ((int) (Math.random() * 60) - 10);
                    System.out.print("  " + arrayA[i]);
                    a = arrayA;
                }
                break;

            default:
                int[] arrayD = {2, 5, 6, -23, 45, -67, 12};
                for (int i = 0; i < arrayD.length; i++) {
                    System.out.print(" " + arrayD[i]);
                    a = arrayD;
                }
                break;
        }
        System.out.println();
        return a;
    }
}