package Java;

import java.util.Scanner;

public class XORStringsTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = xorString(s1, s2);
        System.out.println(result);
    }

    public static String xorString(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        StringBuilder xorString = new StringBuilder();
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if (arr1[i] == arr2[i]) {
                xorString.append("0");
            } else {
                xorString.append("1");
            }
        }
        return xorString.toString();
    }
}

