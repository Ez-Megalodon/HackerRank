package Java;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> nums = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < queries.size(); i++){
            total = 0;
            for (int k = 0; k < strings.size(); k++){
                if (strings.get(k).equals(queries.get(i))){
                    total++;
                }
            }
            nums.add(total);
        }
        return nums;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bc");
        strings.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("abc");
        queries.add("bc");
        queries.add("b");

        matchingStrings(strings, queries);
    }

}
