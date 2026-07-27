package level01;
import java.util.Scanner;
public class ReturnMethodDemo {
    public static int calculateSum(int a, int b){
        return a+b;
    }
    public static int calculateSquare(int a){
        return a*a;
    }
    public static boolean isAdult(int age){
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers you want to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is: " + sum);
        int square = calculateSquare(a);
        System.out.printf("Square of %d is %d.%n " ,a ,square);
        System.out.println();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        boolean adult = isAdult(age);
        System.out.println("You are adult." + adult);
    }
}
