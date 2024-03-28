import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Float input
        System.out.println("Enter a float number: ");
        float f = sc.nextFloat();
        // Integer input
        System.out.println("Enter an integer number: ");
        int i = sc.nextInt();
        // String input
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        // Char input
        System.out.println("Enter a char: ");
        char c = sc.next().charAt(0);
        // Boolean input
        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        // Print the values
        System.out.println("Float: " + f);
        System.out.println("Integer: " + i);
        System.out.println("String: " + s);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + b);
        sc.close();
    }
}