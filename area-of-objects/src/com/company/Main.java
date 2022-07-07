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
                    double circleRadius = sc.nextDouble();
                    double circleAnswer = circle(circleRadius);
                    System.out.println("The area of the circle is: " + circleAnswer);
                    break;
                case 2:
                    System.out.println("You selected Triangle!\n\nEnter the base: ");
                    double triangleBase = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double triangleHeight = sc.nextDouble();
                    double triangleAnswer = triangle(triangleBase, triangleHeight);
                    System.out.println("The area of the triangle is: " + triangleAnswer);
                    break;
                case 3:
                    System.out.println("You selected Square!\n\nEnter the length: ");
                    double squareLength = sc.nextDouble();
                    double squareAnswer = square(squareLength);
                    System.out.println("The area of the square is: " + squareAnswer);
                    break;
                case 4:
                    System.out.println("You selected Rectangle!\n\nEnter the length: ");
                    double rectangleLength = sc.nextDouble();
                    System.out.println("Enter the width: ");
                    double rectangleWidth = sc.nextDouble();
                    double rectangleAnswer = rectangle(rectangleLength, rectangleWidth);
                    System.out.println("The area of the rectangle is: " + rectangleAnswer);
                    break;
                case 5:
                    System.out.println("You selected Parallelogram!\n\nEnter the base: ");
                    double pBase = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double pHeight = sc.nextDouble();
                    double pAnswer = parallelogram(pBase, pHeight);
                    System.out.println("The area of the parallelogram is: " + pAnswer);
                    break;
                case 6:
                    System.out.println("You selected Parallelogram!\n\nEnter the first side: ");
                    double trapeziumA = sc.nextDouble();
                    System.out.println("Enter the second side: ");
                    double trapeziumB = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double trapeziumHeight = sc.nextDouble();
                    double trapeziumAnswer = trapezium(trapeziumA, trapeziumB, trapeziumHeight);
                    System.out.println("The area of the trapezium is: " + trapeziumAnswer);
                    break;
                case 7:
                    System.out.println("You selected Ellipse!\n\nEnter the half of minor axis: ");
                    double ellipseA = sc.nextDouble();
                    System.out.println("Enter half of major axis");
                    double ellipseB = sc.nextDouble();
                    double ellipseAnswer = ellipse(ellipseA, ellipseB);
                    System.out.println("The area of the ellipse is: " + ellipseAnswer);
                    break;
                case 8:
                    System.out.println("You selected Polygon!\n\nEnter the number of sides: ");
                    int numberOfSides = sc.nextInt();
                    System.out.println("Enter the length of side: ");
                    double lengthOfSides = sc.nextDouble();
                    double polygonAnswer = polygon(numberOfSides, lengthOfSides);
                    System.out.println("The area of the polygon is: " + polygonAnswer);
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
