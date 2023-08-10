import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Invalid String Entered");
        } else {
            String[] tokens = s.split("[^A-Za-z]+");

            System.out.println(tokens.length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }

        scanner.close();
    }
}
