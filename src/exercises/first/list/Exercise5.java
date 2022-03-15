package exercises.first.list;

/*
    Exercise 5 : Write a program to read a code of one piece 1, the number of pieces 1, the unitary value of each
    piece 1, the code of one piece 2, the number of piece 2, the unitary value of piece 2. Calculate and show
    the value the amount be paid.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int codePiece1, numberPieces1, codePiece2, numberPieces2;
        double unitaryValuePiece1, unitaryValuePiece2;

        codePiece1 = scanner.nextInt();
        numberPieces1 = scanner.nextInt();
        unitaryValuePiece1 = scanner.nextDouble();

        codePiece2 = scanner.nextInt();
        numberPieces2 = scanner.nextInt();
        unitaryValuePiece2 = scanner.nextDouble();

        double sum = numberPieces1 * unitaryValuePiece1 + numberPieces2 * unitaryValuePiece2;

        System.out.printf("Total value to pay: %.2f", sum);


    }
}
