package m16_Conditionals;

import java.util.Scanner;

public class largerThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Second Number:");
        int second = Integer.valueOf(scanner.nextLine());

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (first < second) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
