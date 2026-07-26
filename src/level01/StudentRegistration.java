package level01;
import java.util.Scanner;
public class StudentRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Student Registration =====");
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        System.out.print("Enter student age: ");
        int studentAge = input.nextInt();
        final int MIN_STUDENT_AGE = 16;
        input.nextLine();
        if (studentAge < MIN_STUDENT_AGE ) {
            System.out.println("Registration Failed!!!");
            System.out.println("Student age must be at least 16");
        }
        else {
            System.out.print("Enter student Roll Number: ");
            String studentRoll = input.nextLine();
            System.out.print("Enter student Branch: ");
            String studentBranch = input.nextLine();
            System.out.print("Enter student Semester: ");
            int studentSemester = input.nextInt();
            input.nextLine();
            System.out.print("Enter student Phone Number: ");
            String studentPhone = input.nextLine();
            System.out.print("Enter student Email: ");
            String studentEmail = input.nextLine();
            System.out.println();
            System.out.println("Registration Successful!!!");
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.printf("Student Name : %s%n" ,studentName);
            System.out.printf("Age          : %d%n" ,studentAge);
            System.out.printf("Roll         : %s%n" ,studentRoll);
            System.out.printf("Branch       : %s%n" ,studentBranch);
            System.out.printf("Semester     : %d%n" ,studentSemester);
            System.out.printf("Phone Number : %s%n" ,studentPhone);
            System.out.printf("Email        : %s%n" ,studentEmail);
            System.out.println("-----------------------------------");
        }
        input.close();
    }
}
