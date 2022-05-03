import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text:");
        String response1 = scanner.nextLine();
        System.out.println("Enter an integer:");
        int response2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double:");
        double response3 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        boolean response4 = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + response1);
        System.out.println("Your integer is " + response2);
        System.out.println("Your double is " + response3);
        System.out.println("Your boolean is " + response4);

        scanner.close();
}
}