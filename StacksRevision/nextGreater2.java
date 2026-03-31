package StacksRevision;

import java.util.Arrays;

public class nextGreater2 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        Arrays.fill(ans, -1);

        for (int i = 0; i < len; i++) {
            boolean found = false;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > nums[i]) {
                    found = true;
                    ans[i] = nums[j];
                    break;
                }
            }
            if (found == false) {
                for (int k = 0; k < i; k++) {
                    if (nums[k] > nums[i]) {
                        found = true;
                        ans[i] = nums[k];
                        break;
                    } 
                }
            }

        }
        return ans;
    }
}
