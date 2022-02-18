package m15_Numbers;

import java.util.Scanner;

public class opFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Second Number");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Add: " + first + " + " + second + " = " + (first + second));

        System.out.println("Subtract: " + first + " - " + second + " = " + (first - second));

        System.out.println("Multiply: " + first + " * " + second + " = " + (first * second));

        // For division, if both values are integers / rounds to floor
        System.out.println("Divide: " + first + " / " + second + " = " + (first / second));

        // convert int to double with a type casting operation
        System.out.println("Divide: " + first + " / " + second + " = " + ((double)first / second));

        // Where the type cast is placed matters
        System.out.println("Divide: " + first + " / " + second + " = " + (first / (double)second));

        // Since double is placed outside the parentheses, the floor rounding already occured
        System.out.println("Divide: " + first + " / " + second + " = " + (double)(first / second));

        int dividend = 3;
        int divisor = 2;

        // Where a floating point is can convert result differently
        // Float first creates correct rounding
        double result1 = 1.0 * dividend / divisor;

        // Float second creates incorrect
        double result2 = dividend / divisor * 1.0;

        System.out.println("First: " + result1 + ", Second: " + result2);

    }
}
