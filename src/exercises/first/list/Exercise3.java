package exercises.first.list;

import java.util.Scanner;

/*
    Exercise 3 : Write a program to read four integer values A, B, C, D. Then calculate and show the product difference
    A and B by the product of C and D by the formula = (A * B - C * D).
*/
public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        System.out.println("The product difference is " + ((A * B)- (C * D)));
    }
}
