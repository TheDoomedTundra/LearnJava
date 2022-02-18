package m16_Conditionals;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number:");
        int first = Integer.valueOf(scanner.nextLine());

;

        if (first % 2 == 0) {
            System.out.println("Number " + first + " is even");
        } else {
            System.out.println("Number " + first + " is odd");
        }
    }
}
