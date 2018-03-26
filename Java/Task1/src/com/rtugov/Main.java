package com.rtugov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = 0, b = 0;

        try {
            System.out.print("Enter a number: a = ");
            a = scanner.nextFloat();
            System.out.print("Enter a number: b = ");
            b = scanner.nextFloat();
        }
        catch (InputMismatchException e) {
            System.out.println("An integer number was expected! Crash!");
            return;
        }

        System.out.println("Arithmetical operations:");
        System.out.println("(a + b): " + (a + b));
        System.out.println("(a - b) " + (a - b));
        System.out.println("(a * b): " + (a * b));
        System.out.println("(a / b): " + (a / b));
        System.out.println("(a % b): " + (a % b));
    }
}
