package Java;

import java.util.Scanner;

public class ScannerHasNext {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(scanner.hasNextLine()){
            System.out.printf("%d %s%n",++i, scanner.nextLine());
        }
    }
}
