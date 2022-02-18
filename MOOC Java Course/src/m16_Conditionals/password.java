package m16_Conditionals;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "HelloThere";

        System.out.println("Password?");
        String input = scanner.nextLine();

        // To compare strings, use equals() command
        if (input.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Begone!");
        }

        // Conditional operators and(&&) or(||) not(!)
    }
}
