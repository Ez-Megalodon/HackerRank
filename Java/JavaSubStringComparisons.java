package Java;

import java.util.Scanner;
public class JavaSubStringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (smallest.compareTo(temp) > 0) smallest = temp;
            if (largest.compareTo(temp) < 0) largest = temp;
        }
        return smallest + "\n" + largest;
    }
}
