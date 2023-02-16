package org.example;

import org.example.exceptions.InvalidOperatorException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double result, num1, num2;
        char operator;

        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        try {
            result = calculator.calculate(num1, num2, operator);
        } catch (InvalidOperatorException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The result is: " + result);
    }
}