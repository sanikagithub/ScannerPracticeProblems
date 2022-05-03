import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String response1 = scanner.nextLine();
        System.out.println("What is their superpower?");
        String response2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + response1 + ", who had the power of "+ response2 + ".");
        System.out.println("As they grew older, " + response1 + " saw that the world needed them.");
        System.out.println(response1 + " used their ability to "+ response2 + " to save the world.");

        scanner.close();
    
}
}