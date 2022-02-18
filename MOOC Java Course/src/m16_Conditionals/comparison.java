package m16_Conditionals;

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }

        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
