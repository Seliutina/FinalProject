package com.goit.anotherExamples.printTriangle;

/**
 * Let’s print a triangle made of asterisks (‘*’) separated by spaces and consisting
 of n rows again, but this time upside down, and make it symmetrical. Consecutive rows should
 contain 2n − 1, 2n − 3, . . . , 3, 1 asterisks and should be indented by 0, 2, 4, . . . , 2(n − 1)
 spaces. For example, for n = 4 the triangle should appear as follows:
 * * * * * * *
   * * * * *
     * * *
       *
 The triangle should have n rows, where n is some given positive integer
 */
public class PrintSymmetricalTriangle {
    public static void main(String[] args) {
        PrintSymmetricalTriangle printSymmetricalTriangle = new PrintSymmetricalTriangle();
        printSymmetricalTriangle.printSymmetricalTriangle(5);
        System.out.println();
        printSymmetricalTriangle.printOneMoreSymmetricalTriangle(5);

    }
    private void printSymmetricalTriangle(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void printOneMoreSymmetricalTriangle(int n){
        for (int i = 0; i < n ; i++){
            for (int k = 0; k < i  ; k++){
                System.out.print(" ");
            }


            for (int j = 0; j < 2*((n - 1) - i) - 1; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
