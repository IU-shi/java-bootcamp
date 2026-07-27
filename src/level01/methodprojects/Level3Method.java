package level01.methodprojects;

public class Level3Method {
     public static void displayHeading(String heading){
         System.out.println("==================");
         System.out.println(heading);
         System.out.println("==================");
     }
     public static void displayATMMenu(){
         System.out.println("1. Withdraw");
         System.out.println("2. Deposit");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
         System.out.println();
     }
     public static void displayRestaurantMenu(){
         System.out.println("1. Burger");
         System.out.println("2. Pizza");
         System.out.println("3. Noodles");
         System.out.println("4. Pastry");
         System.out.println("5. Coffee");
         System.out.println();
     }
     public static void displayFooter(){
         System.out.println("==================");
         System.out.println("Thank you ");
         System.out.println("==================");
     }
     public static void main(String[] args){
         displayHeading("ATM");
         displayATMMenu();
         displayFooter();
         System.out.println();
         displayHeading("Restaurant Menu");
         displayRestaurantMenu();
         displayFooter();
     }
}
