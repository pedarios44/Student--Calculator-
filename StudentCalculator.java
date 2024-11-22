
package com.mycompany.student.calculator;

import java.util.Scanner;


public class StudentCalculator {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Calculator!");
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            double result;
            
            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid operator!");
            }
        }
    }
}