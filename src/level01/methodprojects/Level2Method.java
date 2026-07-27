package level01.methodprojects;
import java.util.Scanner;
public class Level2Method {
    public static void displayHeading(String heading){
        System.out.println("====================");
        System.out.println(heading);
        System.out.println("====================");
    }
    public static void studentDescription(String name, int age) {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n" ,age);
    }
    public static void welcomeMessage(String name) {
        System.out.printf("Welcome, %s!%n", name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        displayHeading("Student Registration");
        studentDescription(name, age);
        System.out.println();
        displayHeading("Student Registration");
        welcomeMessage(name);
        input.close();
    }
}

