package Java;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        if(start >= 0 && end <= s.length() && start <= end){
            String result = s.substring(start, end);
            System.out.println(result);
        }
    }
}