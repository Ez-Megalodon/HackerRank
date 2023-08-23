package Java;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int current = a.get(i);
            boolean isLonely = true;
            for (int j = 0; j < a.size(); j++) {
                if (i != j && current == a.get(j)) {
                    isLonely = false;
                    break;
                }
            }
            if (isLonely) {
                return current;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        System.out.println(lonelyinteger(nums));
    }
}
