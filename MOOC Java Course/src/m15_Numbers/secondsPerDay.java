package m15_Numbers;

import java.util.Scanner;

public class secondsPerDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        int seconds = number * 24 * 60 * 60;
        System.out.println(number + " days is " + seconds + " seconds.");

        // Mathematical precedence (PEMDAS) applies to printing strings
        System.out.println("Four: " + (2+2));

        // If no parentheses applied, prints as separate strings
        System.out.println("Twenty two: " + 2 + 2);
    }
}
