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
            int object2D = sc.nextInt();

            switch (object2D) {
                case 1 -> {
                    System.out.println("You selected Circle!\n\nEnter the radius: ");
                    double circleRadius = sc.nextDouble();
                    double circleAnswer = circle(circleRadius);
                    System.out.println("The area of the circle is: " + circleAnswer);
                }
                case 2 -> {
                    System.out.println("You selected Triangle!\n\nEnter the base: ");
                    double triangleBase = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double triangleHeight = sc.nextDouble();
                    double triangleAnswer = triangle(triangleBase, triangleHeight);
                    System.out.println("The area of the triangle is: " + triangleAnswer);
                }
                case 3 -> {
                    System.out.println("You selected Square!\n\nEnter the length: ");
                    double squareLength = sc.nextDouble();
                    double squareAnswer = square(squareLength);
                    System.out.println("The area of the square is: " + squareAnswer);
                }
                case 4 -> {
                    System.out.println("You selected Rectangle!\n\nEnter the length: ");
                    double rectangleLength = sc.nextDouble();
                    System.out.println("Enter the width: ");
                    double rectangleWidth = sc.nextDouble();
                    double rectangleAnswer = rectangle(rectangleLength, rectangleWidth);
                    System.out.println("The area of the rectangle is: " + rectangleAnswer);
                }
                case 5 -> {
                    System.out.println("You selected Parallelogram!\n\nEnter the base: ");
                    double pBase = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double pHeight = sc.nextDouble();
                    double pAnswer = parallelogram(pBase, pHeight);
                    System.out.println("The area of the parallelogram is: " + pAnswer);
                }
                case 6 -> {
                    System.out.println("You selected Parallelogram!\n\nEnter the first side: ");
                    double trapeziumA = sc.nextDouble();
                    System.out.println("Enter the second side: ");
                    double trapeziumB = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double trapeziumHeight = sc.nextDouble();
                    double trapeziumAnswer = trapezium(trapeziumA, trapeziumB, trapeziumHeight);
                    System.out.println("The area of the trapezium is: " + trapeziumAnswer);
                }
                case 7 -> {
                    System.out.println("You selected Ellipse!\n\nEnter the half of minor axis: ");
                    double ellipseA = sc.nextDouble();
                    System.out.println("Enter half of major axis");
                    double ellipseB = sc.nextDouble();
                    double ellipseAnswer = ellipse(ellipseA, ellipseB);
                    System.out.println("The area of the ellipse is: " + ellipseAnswer);
                }
                case 8 -> {
                    System.out.println("You selected Polygon!\n\nEnter the number of sides: ");
                    int numberOfSides = sc.nextInt();
                    System.out.println("Enter the length of side: ");
                    double lengthOfSides = sc.nextDouble();
                    double polygonAnswer = polygon(numberOfSides, lengthOfSides);
                    System.out.println("The area of the polygon is: " + polygonAnswer);
                }
                default -> System.out.println("You didn't make a valid entry ");
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
            int object3D = sc.nextInt();

            switch (object3D) {
                case 1 -> {
                    System.out.println("You selected Cube!\n\nEnter the length: ");
                    double cubeLength = sc.nextDouble();
                    double cubeAnswer = cube(cubeLength);
                    System.out.println("The area of the cube is: " + cubeAnswer);
                }
                case 2 -> {
                    System.out.println("You selected Rectangular Prism!\n\nEnter the length: ");
                    double rLength = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double rHeight = sc.nextDouble();
                    System.out.println("Enter the width: ");
                    double rWidth = sc.nextDouble();
                    double rAnswer = rectangularPrism(rLength, rWidth, rHeight);
                    System.out.println("The area of the rectangular prism is: " + rAnswer);
                }
                case 3 -> {
                    System.out.println("You selected Cylinder!\n\nEnter the radius: ");
                    double cylinderRadius = sc.nextDouble();
                    System.out.println("Enter the height: ");
                    double cylinderHeight = sc.nextDouble();
                    double cylinderAnswer = cylinder(cylinderRadius, cylinderHeight);
                    System.out.println("The area of the cylinder is: " + cylinderAnswer);
                }
                case 4 -> {
                    System.out.println("You selected Cone!\n\nEnter the length: ");
                    double coneLength = sc.nextDouble();
                    System.out.println("Enter the radius: ");
                    double coneRadius = sc.nextDouble();
                    double coneAnswer = cone(coneRadius, coneLength);
                    System.out.println("The area of the cone is: " + coneAnswer);
                }
                case 5 -> {
                    System.out.println("You selected Sphere!\n\nEnter the radius: ");
                    double sphereRadius = sc.nextDouble();
                    double sphereAnswer = sphere(sphereRadius);
                    System.out.println("The area of the sphere is: " + sphereAnswer);
                }
                case 6 -> {
                    System.out.println("You selected Hemisphere!\n\nEnter the radius: ");
                    double hemisphereRadius = sc.nextDouble();
                    double hemisphereAnswer = hemisphere(hemisphereRadius);
                    System.out.println("The area of the sphere is: " + hemisphereAnswer);
                }
                default -> System.out.println("You didn't make a valid entry ");
            }
        }
        else {
            System.out.println("You entered a wrong input! ");
        }

    }
}
