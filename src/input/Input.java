package input;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* String */
        String x;
        x = scanner.next();
        System.out.println("Your input: " + x);

        /* int */
        int y;
        y = scanner.nextInt();
        System.out.println("Your input: " + y);

        /* double
         If you need, you can choose your locale using Locale.setDefault()
         Example: Locale.setDefault(Locale.US) */
        double z;
        z = scanner.nextDouble();
        System.out.println("Your input: " + z);

        /* char */
        char a;
        a = scanner.next().charAt(0);
        System.out.println("Your input: " + a);

        /* input line */
        scanner.nextLine();
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();

        System.out.println("Your input: ");
        System.out.println(s1);
        System.out.println(s2);

        scanner.close();
    }
}
