package m14_Variables;

public class VariableExample {
    public static void main(String[] args) {

        // Assign integer, floating point, string, boolean
        int chicken = 3;
        double bacon = 5.5;
        String tractor = "None!";
        boolean trueOrFalse = true;

        System.out.println("Chicken:" + "\n" + chicken);
        System.out.println("Bacon (kg):" + "\n" + bacon);
        System.out.println("Tractor:" + "\n" + tractor);
        System.out.println();
        System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
        System.out.println(trueOrFalse);

        // To reassign value, don't need to declare the type
        chicken = 100;
        bacon = 9.999;
        tractor = "John Deere";

        System.out.println();
        System.out.println("New Values:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);

        // Variable types cannot be changed once they are declared.
        // However, integers can be assigned a double. Doubles cannot be assigned an integer.

        // Java convention is camelCase
        int camelCase = 9;

        // String to integer conversion
        String valueString = "42";
        int value = Integer.valueOf(valueString);
        System.out.println(value);
    }
}
