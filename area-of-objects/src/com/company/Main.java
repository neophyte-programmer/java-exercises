package com.company;

import java.util.*;
import java.lang.*;

public class Main {
    //    2 DIMENSIONAL OBJECTS
    // Area of circle
    public static double circle(double radius) {
        // π × r2
        return Math.PI * Math.pow(2, radius);
    }

    // Area of triangle
    public static double triangle(double base, double height) {
//        ½ × b × h
        return 0.5 * base * height;
    }

    // Area of square
    public static double square(double length) {
        return Math.pow(2, length);
    }

    // Area of rectangle
    public static double rectangle(double length, double width) {
        return length * width;
    }

    // Area of parallelogram
    public static double parallelogram(double base, double height) {
        return base * height;
    }

    // Area of trapezium
    public static double trapezium(double a, double b, double height) {
        return 0.5 * (a + b) * height;
    }

    // Area of ellipse
    public static double ellipse(double a, double b) {
//        πab
        return Math.PI * a * b;
    }

    // Area of polygon
    public static double polygon(int sides, double length) {
        return sides * Math.pow(2, length) / (4 * Math.tan(Math.PI / sides));
    }

    //    3 DIMENSIONAL OBJECTS
    // Area of cube
    public static double cube(double length) {
        return 6 * Math.pow(2, length);
    }

    // Area of rectangular prism
    public static double rectangularPrism(double length, double width, double height) {
        return 2 * ( (length * width) + (height * length) + (height * width));
    }

    // Area of cylinder
    public static double cylinder(double radius, double height) {
        return 2 * Math.PI * radius * ( radius + height);
    }

    // Area of cone
    public static double cone(double radius, double length) {
        return Math.PI * radius * ( radius + length);
    }

    // Area of sphere
    public static double sphere(double radius) {
        return 4 * Math.PI * Math.pow(2, radius);
    }

    // Area of hemisphere
    public static double hemisphere(double radius) {
        return 3 * Math.PI * Math.pow(2, radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("""
                Hello, welcome to the Area Calculator!
                =======================================

                Enter the type of object you want to compute
                ( 1 ) for 2D objects
                ( 2 ) for 3D objects
                """);
        int objectOption = sc.nextInt();

        if (objectOption == 1) {
            System.out.println("""
                    Enter the object you want to compute
                    =====================================
                    ( 1 ) Circle
                    ( 2 ) Triangle
                    ( 3 ) Square
                    ( 4 ) Rectangle
                    ( 5 ) Parallelogram
                    ( 6 ) Trapezium
                    ( 7 ) Ellipse
                    ( 8 ) Polygon
                    """);
            int objectSelect = sc.nextInt();

            switch (objectSelect) {
                case 1:
                    System.out.println("You selected Circle!\n\nEnter the radius: ");
                    int circleRadius = sc.nextInt();
                    double circleAnswer = circle(circleRadius);
                    System.out.println("The area of the circle is: " + circleAnswer);
                    break;
                case 2:
                    System.out.println("Enter the base: ");
                    int triangleBase = sc.nextInt();
                    System.out.println("Enter the height: ");
                    int triangleHeight = sc.nextInt();
                    double triangleAnswer = triangle(triangleBase, triangleHeight);
                    System.out.println("The area of the triangle is: " + triangleAnswer);
                    break;
                case 3:
                    System.out.println("Enter the length: ");
                    break;
                case 4:
                    System.out.println("Enter the radius: ");
                    break;
                case 5:
                    System.out.println("Enter the radius: ");
                    break;
                case 6:
                    System.out.println("Enter the radius: ");
                    break;
                case 7:
                    System.out.println("Enter the radius: ");
                    break;
                case 8:
                    System.out.println("Enter the radius: ");
                    break;
                default:
                    System.out.println("You didn't make a valid entry ");
                    break;
            }
        }
        else if (objectOption == 2) {
            System.out.println("""
                    Enter the object you want to compute
                    =====================================
                    ( 1 ) Cube
                    ( 2 ) Rectangular Prism
                    ( 3 ) Cylinder
                    ( 4 ) Cone
                    ( 5 ) Sphere
                    ( 6 ) Hemisphere
                    """);
            int objectSelect = sc.nextInt();
        }
        else {
            System.out.println("You entered a wrong input! ");
        }

    }
}
