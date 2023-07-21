import java.util.ArrayList;
import java.util.List;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < 100;i++){
            newArr.add(0);
        }
        System.out.println(newArr.size());

        for (int k = 0; k < arr.size();k++){
            int index = arr.get(k);
            newArr.set(index, newArr.get(index) + 1);
        }

        System.out.println(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        countingSort(arr);
    }
}
