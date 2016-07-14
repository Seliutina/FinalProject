package com.goit.lessons.homeWork.module06.module05withExceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArrayAgain {
    public static void main(String args[]) {

        ActionWithArray.minElement(fill());
        ActionWithArray.maxElement(fill());
        ActionWithArray.shakerSort(fill());
    }

    private static int[] fill() throws NegativeArraySizeException,InputMismatchException, ArrayIndexOutOfBoundsException{
        int[] a = {};
        Scanner input = new Scanner(System.in);
        System.out.println("To input array elements from keyboard enter K, to fill " +
                "array automatically enter A");

        String choice = input.nextLine();
        Scanner scanner = new Scanner(System.in);

        switch (choice) {

            case "K":
                try{
                    System.out.println("Input array size: ");
                    int size = scanner.nextInt();
                    if (size == 0) {
                        throw new ArrayIndexOutOfBoundsException("[ERROR] ");
                    }
                    if (size == 4) {
                        {
                            throw new NoSuchElementException("[ERROR] ");
                        }
                    }
                    int arrayK[] = new int[size];

                    for (int i : arrayK) {
                        System.out.println("Input array elements: ");
                        arrayK[i] = scanner.nextInt();
                    }
                    for (int i : arrayK) {
                        System.out.print("  " + arrayK[i]);
                        a = arrayK;

                    }
                    System.out.println();
                    break;
                }catch(InputMismatchException e)
                {System.err.println("[WARNING]: Array's size or elements should be integer, default array in work");}
                catch (NegativeArraySizeException e) {
                    System.err.println("[WARNING]: Array's size must be positive value, default array in work");
                }catch (ArrayIndexOutOfBoundsException e){
                    System.err.println("[WARNING]: Array length is 0, should be 1 or more, default array in work ");
                }

            case "A":
                int[] arrayA = new int[10];
                for (int i = 0; i < arrayA.length; i++) {
                    arrayA[i] = ((int) (Math.random() * 60) - 10);
                    System.out.print("  " + arrayA[i]);
                    a = arrayA;
                }
                break;

            default:
                System.out.println("You does not select fill array from keyboard(K) or fill Array automatically(A), " +
                        "so Default array is used");
                int[] defaultArray = new int[10];
                for (int i = 0; i < defaultArray.length; i++) {
                    defaultArray[i] = ((int) (Math.random() * 60) - 10);
                    System.out.print("  " + defaultArray[i]);
                    a = defaultArray;
                }
                break;
        }
        System.out.println();
        return a;
    }
}
