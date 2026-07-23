import java.util.Scanner;
public class StudentIDcard {
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println(" Student IDcard Generator ");
        System.out.println("==========================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student's age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student's College name: ");
        String clg = sc.nextLine();
        System.out.print("Enter Student's stream: ");
        String stream = sc.nextLine();
        System.out.print("Enter Student's semester: ");
        int semester = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student's dream job: ");
        String  djob = sc.nextLine();
        System.out.println("Press 1 to generate Student's IDcard.");
        System.out.println("Press anything else to exit.");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("========================");
            System.out.println("     Student IDcard     ");
            System.out.println("========================");
            System.out.println(" ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("College: " + clg);
            System.out.println("Stream: " + stream);
            System.out.println("Semester: " + semester);
            System.out.println("Dream Job: " + djob);
            System.out.println(" ");
            System.out.println("========================");
        }
        else {
            System.out.println("Thankyou for the data'");
        }

    }
}
