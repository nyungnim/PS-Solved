import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 0) return new int[0];
        List<Integer> result = new ArrayList<>();
        int previous = arr[0];
        result.add(previous);
        for (int i=1; i<arr.length; i++) {
            if (arr[i] != previous) {
                result.add(arr[i]);
                previous = arr[i];
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}