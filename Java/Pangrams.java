package Java;

import java.util.ArrayList;
import java.util.List;

public class Pangrams {
    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        List<Character> alphabetList = new ArrayList<>();
        s = s.toLowerCase();
        char[] stringArray = s.toCharArray();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabetList.add(letter);
        }

        for (int i = 0; i < s.length(); i++){
            if (alphabetList.contains(stringArray[i])){
                alphabetList.remove((Character)stringArray[i]);
            }
        }

        if (alphabetList.size() > 0){
            return "not pangram";
        } else {
            return "pangram";
        }
    }

    public static void main(String[] args) {
        System.out.println(pangrams("The quick brown fox jumps over a lazy dog"));
    }
}
