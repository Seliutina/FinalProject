package com.goit.lessons.homeWork.module06.module05withExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
        try {
            ActionWithArray.minElement(fill());
            ActionWithArray.maxElement(fill());
            ActionWithArray.shakerSort(fill());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR]: array lenght is 0, should be 1 or more, operation was interrupted");

        } catch (InputMismatchException e) {
            System.err.println("[ERROR]: Array's size or elements should be integer, operation was interrupted");

        } catch (NegativeArraySizeException e) {
            System.err.println("[ERROR]: Array's size must be positive value, operation was interrupted");

        }
    }

    private static int[] fill() throws NegativeArraySizeException,InputMismatchException,
            ArrayIndexOutOfBoundsException{
        int[] a = {};
        Scanner input = new Scanner(System.in);
        System.out.println("To input array elements from keyboard enter K, to fill " +
                "array automatically enter A");
        String choice = input.nextLine();

        switch (choice) {

            case "K":
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input array size: ");
                int size = scanner.nextInt();
                int arrayK[] = new int[size];

                for (int i : arrayK) {
                    System.out.println("Input array elements: ");
                    arrayK[i] = scanner.nextInt();
                }
                for (int i : arrayK) {
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
                System.out.println("Please choose some variant (A or K) to fill array");

                break;
        }
        System.out.println();
        return a;
    }
}
