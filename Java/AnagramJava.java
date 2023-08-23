package Java;

import java.util.Scanner;

public class AnagramJava {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] A = new int[26];
        int[] B = new int[26];

        for (char ch : a.toCharArray()) {
            A[ch - 'a']++;
        }
        for (char ch : b.toCharArray()) {
            B[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
