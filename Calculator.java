import java.util.Scanner;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator app! What would you like to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int userSelection =  sc.nextInt();
        switch (userSelection){
            case 1: {
                addition();
            }
        }
    }

    public static void addition(){
        System.out.println("Enter first number you wish to add.");
        int userNum1 = sc.nextInt();
        System.out.printf(String.valueOf(userNum1));
        System.out.printf("%nEnter next number%n");
        int userNum2 = sc.nextInt();
        sc.nextLine();
        System.out.printf("%s + %s = %s", userNum1, userNum2, userNum1 + userNum2);
        System.out.printf("Do you wish to continue? y/n");
    }
}
