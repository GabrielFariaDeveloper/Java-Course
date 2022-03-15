package exercises.first.list;

import java.util.Scanner;

/*
    Exercise 2 : Write a program to read a radius of a circle and then show the area value with four decimal places.
    Area formula = π * radius²
    Consider the value of π = 3.14159
*/
public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;
        double Pi = 3.14159;

        radius = scanner.nextDouble();

        System.out.printf("The circle area volume is %.4f", (Pi * (Math.pow(radius, 2))));
    }
}
