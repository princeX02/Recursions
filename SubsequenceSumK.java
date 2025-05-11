import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumK {

    public static List<List<Integer>> sumK(int idx, int[] arr, int sum, int k, List<Integer> ds) {
        List<List<Integer>> result = new ArrayList<>();

        if (idx == arr.length) {
            if (sum == k) {
                result.add(new ArrayList<>(ds)); // add a copy
            }
            return result;
        }

        // Include the current element
        ds.add(arr[idx]);
        result.addAll(sumK(idx + 1, arr, sum + arr[idx], k, ds));
        ds.remove(ds.size() - 1); // backtrack

        // Exclude the current element
        result.addAll(sumK(idx + 1, arr, sum, k, ds));

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<List<Integer>> subsequences = sumK(0, arr, 0, 2, new ArrayList<>());

        System.out.println("Subsequences with sum = 2:");
        for (List<Integer> seq : subsequences) {
            System.out.println(seq);
        }
    }
}
