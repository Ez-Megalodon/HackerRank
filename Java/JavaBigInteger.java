package Java;

import java.util.Scanner;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();

        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        System.out.println(sum);
        System.out.println(product);
    }
}
