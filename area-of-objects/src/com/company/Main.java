package com.company;

import java.util.*;
import java.lang.*;

public class Main {
    //    2 DIMENSIONAL OBJECTS
    // Area of circle
    public static double circle(int radius) {
        // π × r2
        return Math.PI * Math.pow(2, radius);
    }

    // Area of triangle
    public static float triangle() {
        return 5;
    }

    // Area of square
    public static float square() {
        return 5;
    }

    // Area of rectangle
    public static float rectangle() {
        return 5;
    }

    // Area of parallelogram
    public static float parallelogram() {
        return 5;
    }

    // Area of trapezium
    public static float trapezium() {
        return 5;
    }

    // Area of ellipse
    public static float ellipse() {
        return 5;
    }

    // Area of polygon
    public static float polygon() {
        return 5;
    }

    //    3 DIMENSIONAL OBJECTS
    // Area of cube
    public static float cube() {
        return 5;
    }

    // Area of rectangular prism
    public static float rectangularPrism() {
        return 5;
    }

    // Area of cylinder
    public static float cylinder() {
        return 5;
    }

    // Area of cone
    public static float cone() {
        return 5;
    }

    // Area of sphere
    public static float sphere() {
        return 5;
    }

    // Area of hemisphere
    public static float hemisphere() {
        return 5;
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
