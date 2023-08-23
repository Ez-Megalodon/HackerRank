package Java;

import java.util.List;

public class SubarrayDivisionOne {
    public static int birthday(List<Integer> s, int d, int m) {
        int totalWays = 0;
        int sum = 0;

        for (int i = 0; i < m; i++){
            sum += s.get(i);
        }

        for (int j = m; j < s.size(); j++){
            if (sum == d){
                totalWays++;
            }
            sum = sum - s.get(j - m) + s.get(j);
        }

        if (sum == d){
            totalWays++;
        }

        return totalWays;
    }


}
