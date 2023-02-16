package org.example;

import org.example.exceptions.InvalidOperatorException;



public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double toThePowerOf(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double calculate(double num1, double num2, char operator) throws InvalidOperatorException {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '^':
                result = toThePowerOf(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                throw new InvalidOperatorException("Error! " + operator + " operator is not correct");
        }

        return result;
    }
}
