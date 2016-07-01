package com.goit.anotherExamples.equationSystem;
/*
Задана кусочно - непрерывная функция. Вычислить значения функции в областях существования,
в противном случае вывести на печать сообщение об отсутствии решения.
 */

import java.util.Scanner;

public class SystemsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = scanner.nextDouble();

        Systems systems = new Systems();
        systems.functionSolution(x);

    }
}
