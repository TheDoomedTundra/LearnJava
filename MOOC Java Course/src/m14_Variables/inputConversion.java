package m14_Variables;

import java.util.Scanner;

public class inputConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for number
        System.out.println("Give me a number:");

        // Convert string input to integer
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("You wrote " + value);

        // Prompt again for a double
        System.out.println();
        System.out.println("Give me another number:");
        double dValue = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + dValue);

        // Prompt again for a boolean
        System.out.println();
        System.out.println("Give me a boolean");
        boolean bValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + bValue);
    }
}
