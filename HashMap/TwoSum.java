public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = {-1};
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == target - arr[i]) {
                    ans = new int[]{i, j};
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
