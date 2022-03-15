package exercises.first.list;

/*
    Exercise 6: Write a program to read three value with float numbers of double precision: A, B and C. Than, calculate
    and show:

    A) the area of a right triangle that has A for its base and C for its height.
    B) the area of circle of radius C. (pi = 3.14159).
    C) the area of trapeze that has A and B for base abd C for its height.
    D) the area of square that has side B.
    E) the area of rectangle that has sides A and B.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A, B, C, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;
        double pi = 3.14159;

        A= scanner.nextDouble();
        B= scanner.nextDouble();
        C= scanner.nextDouble();

        triangleArea = (A * C) / 2;
        circleArea = pi * (Math.pow(C, 2));
        trapezeArea = (A + B) * C / 2;
        squareArea = Math.pow(B, 2);
        rectangleArea = A * B;

        System.out.printf("TRIANGLE: %.3f\n", triangleArea);
        System.out.printf("CIRCLE: %.3f\n", circleArea);
        System.out.printf("TRAPEZE: %.3f\n", trapezeArea);
        System.out.printf("SQUARE: %.3f\n", squareArea);
        System.out.printf("RECTANGLE: %.3f\n", rectangleArea);

    }
}
