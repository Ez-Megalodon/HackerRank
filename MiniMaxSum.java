import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        long maxSum = 0;
        long minSum = 0;

        for (Integer num : arr){
            if (num > max){
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        for (Integer num: arr){
            maxSum += num;
            minSum += num;
        }
        System.out.printf("%d %d",minSum - max, maxSum - min);
    }

    public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(3);
            arr.add(5);
            arr.add(7);
            arr.add(9);
            miniMaxSum(arr);
    }
}
