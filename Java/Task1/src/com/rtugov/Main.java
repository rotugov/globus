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

            if (b == 0) throw new ArithmeticException();
        } catch (InputMismatchException e) {
            System.out.println("A number was expected!");
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("You can't enter 0 value as a second argument. It might cause ZeroDivision Exception!");
            System.exit(1);
        }


        System.out.println("Arithmetical operations:");
        System.out.println("(a + b): " + (a + b));
        System.out.println("(a - b) " + (a - b));
        System.out.println("(a * b): " + (a * b));
        System.out.println("(a / b): " + (a / b));
        System.out.println("(a % b): " + (a % b));

    }
}
