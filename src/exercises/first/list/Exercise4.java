package exercises.first.list;

import java.util.Locale;
import java.util.Scanner;

/*
    Exercise 4 : Write a program to read the number of an employee, his number of hours worked, the amount he receives
    for hour and calculates the salary of the employee. Then show the employee number and his salary with two decimal
    places.
*/
public class Exercise4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int employeeNumber;
        double hoursWorked, amountPorHour;

        employeeNumber = scanner.nextInt();
        hoursWorked = scanner.nextDouble();
        amountPorHour = scanner.nextDouble();

        System.out.printf("Employee n° %d: his salary value is U$ %.2f", employeeNumber, (hoursWorked * amountPorHour));
    }
}
