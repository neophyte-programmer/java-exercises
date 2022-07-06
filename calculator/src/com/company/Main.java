package com.company;

import java.util.*;

public class Main {
    // Perform addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Perform subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Perform multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Perform division
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // Perform modulo
    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        //	Write a Java program to print the sum, product, difference, quotient and remainder of two numbers.

        // Take input

        // Read first input
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = inputObject.nextInt();

        // Read second input
        System.out.println("Enter second number: ");
        int secondNumber = inputObject.nextInt();

        // Read operation
        System.out.println("""
                Choose your preferred operation:
                ( + ) for addition
                ( - ) for subtraction
                ( * ) for multiplication
                ( / ) for  division
                ( % ) for remainder""");
        String operation = inputObject.next();

        // Validate operation and print results
        switch (operation) {
            case "+" -> {
                int sum = add(firstNumber, secondNumber);
                System.out.println("The answer is: " + sum);
            }
            case "-" -> {
                int difference = subtract(firstNumber, secondNumber);
                System.out.println("The answer is: " + difference);
            }
            case "*" -> {
                int product = multiply(firstNumber, secondNumber);
                System.out.println("The answer is: " + product);
            }
            case "/" -> {
                int quotient = divide(firstNumber, secondNumber);
                System.out.println("The answer is: " + quotient);
            }
            case "%" -> {
                int remainder = modulo(firstNumber, secondNumber);
                System.out.println("The answer is: " + remainder);
            }
            default -> System.out.println("You did not enter a correct input");
        }

    }
}
