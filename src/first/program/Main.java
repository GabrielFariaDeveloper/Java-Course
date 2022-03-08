package first.program;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int y = 32;
        double x = 10.35484;

        System.out.println(y);
        System.out.println(x);

        //This print show the variable x with the value formatted to two decimal places
        System.out.printf("%.2f\n", x);

        //Define Locale to US to show decimal number with a score instead of a comma if necessary.
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", x);
    }
}
