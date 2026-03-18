import java.util.HashSet;

public class subArraysKDifferentInt {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == k) count++;
                else if (set.size() > k) break;
            }
        }
        return count;
    }
}
