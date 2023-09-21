package Java;

import java.io.*;
import java.math.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger bigInteger = new BigInteger(n);

        boolean isPrime = bigInteger.isProbablePrime(10);

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
