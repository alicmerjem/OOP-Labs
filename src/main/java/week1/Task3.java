package week1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! You are a future Java ninja!");

        scanner.close();
    }
}
