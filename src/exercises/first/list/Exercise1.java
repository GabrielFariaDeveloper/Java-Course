package exercises.first.list;

import java.util.Scanner;

/*
    Exercise 1 : Write a program to read two integer values and then show in console the sum of the values with
    an explanatory message.
*/
public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("The sum of values a and b is " + (a+b));
    }
}
