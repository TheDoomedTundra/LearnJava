package m16_Conditionals;

import java.util.Scanner;

public class speedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What speed are you going?");
        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
