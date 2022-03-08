package first.program;

import java.util.Locale;

public class FixationExercise {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        /*
            Show this in console:
            " Products:
              Computer, which price is $ 2100,00
              Office desk, which price is $ 650,50

              Record: 30 years old, code 5290 and gender: F

              Measure with eight decimal places: 53,23456700
              Rounded (three decimal places): 53,235
              US decimal point: 53.235
            "
        */

        System.out.print("Products:\n"+product1+", which price is $ ");
        System.out.printf("%.2f\n", price1);
        System.out.print(product2+", which price is $ ");
        System.out.printf("%.2f\n\n", price2);
        System.out.printf("Record: %s years old, code %s and gender: %c \n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}
