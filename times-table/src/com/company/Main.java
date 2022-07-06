package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Write a Java program that takes a number as input and prints its multiplication table up to 10.

        // Read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your times table number: ");
        int number = sc.nextInt();

        int product;

        // Loop through multiplication
        for (int i = 1; i <= 12; i++) {
            product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }


    }
}
