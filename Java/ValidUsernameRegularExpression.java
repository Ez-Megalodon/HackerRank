package Java;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Integer.parseInt(scan.nextLine());

        while (a-- != 0) {
            String username = scan.nextLine();

            if (username.matches(ValidUsernameRegularExpression.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
