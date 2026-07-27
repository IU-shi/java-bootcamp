package level01.methodprojects;
import java.util.Scanner;
public class MiniProject {
    public static void displayHeading(String heading){
        System.out.println("======================");
        System.out.println(heading);
        System.out.println("======================");
    }
    public static void getStudentDetails(String name, String semester){
        System.out.printf("Student name: %s%n" , name);
        System.out.printf("Semester: %s%n" , semester);
    }
    public static int calculateTotal(int m1, int m2, int m3){
        return m1 + m2 + m3;
    }
    public static double calculateAverage(double m1, double m2, double m3){
        return (m1 + m2 + m3) / 3.0;
    }
    public static String getGrade(double grade){
        if( grade >= 90 ){
            return "A";
        }
        else if( grade >= 75){
            return "B";
        }
        else if( grade >= 60){
            return "C";
        }
        else if( grade >= 40){
            return "D";
        }
        else{
            return "FAIL";
        }
    }
    public static boolean isPass(double average){
        return average >= 40;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your semester: ");
        String semester = sc.nextLine();
        System.out.println("Enter marks for your top three subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        displayHeading("Student Result System");
        System.out.println();
        getStudentDetails(name, semester);
        System.out.println();
        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(m1, m2, m3);
        String grade = getGrade(average);
        boolean isPass = isPass(average);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
        System.out.println("Passed : " + isPass);
    }
}
