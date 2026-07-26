package level01;

public class MethodDemo {
    public static void displayHeading() {
        System.out.println("=====================");
        System.out.println("Student Registration.");
        System.out.println("=====================");
    }

    public static void displayHeadingV2(String heading) {
        System.out.println("=====================");
        System.out.println(heading);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        displayHeadingV2("library management");
        displayHeading();
    }
}