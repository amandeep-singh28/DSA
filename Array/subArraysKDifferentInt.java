import java.util.HashMap;
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
    public int helper(int nums[], int goal) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int left = 0, right = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) == false) {
                hm.put(nums[i], 1);
            } else {
                int freq = hm.get(nums[i]);
                hm.put(nums[i], freq + 1);
            }
            while (hm.size() > goal) {
                int freq = hm.get(nums[left]);
                hm.put(nums[left], freq - 1);
                if (hm.get(nums[left]) == 0) {
                    hm.remove(nums[left]);
                }
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count = helper(nums, k);
        int count1 = helper(nums, k - 1);
        return count - count1;
    }
}
