import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (Integer num : arr){
            if (num > 0){
                pos++;
            } else if (num < 0){
                neg++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f%n", pos / arr.size());
        System.out.printf("%.6f%n", neg / arr.size());
        System.out.printf("%.6f%n", zero / arr.size());
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }
}
