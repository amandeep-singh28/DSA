import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // for (int j = i + 1; j < n; j++) {
            //     if (arr[j] == target - arr[i]) {
            //         ans = new int[]{i, j};
            //         return ans;
            //     }
            // }
            int partner = target - arr[i];
            if (mp.containsKey(partner)) {
                ans = new int[]{i, mp.get(partner)};
                return ans;
            }
            mp.put(arr[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
