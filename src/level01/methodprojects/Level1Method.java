package level01.methodprojects;
import java.util.Scanner;
public class Level1Method {
    public static void displayGreeting(String name) {
        System.out.printf("Hello, %s!%n", name);
        System.out.println("Welcome to JAVA Bootcamp.");
    }
    public static void printBox(String text) {
        System.out.println("====================");
        System.out.println(text);
        System.out.println("====================");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        displayGreeting(name);
        printBox("library management");
        printBox("studentIDCard Generator");
        printBox("Java Method");
        printBox(name + " Codes");
        input.close();
    }
}