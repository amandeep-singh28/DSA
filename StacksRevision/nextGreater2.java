package StacksRevision;

import java.util.Arrays;
import java.util.Stack;

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
    public int[] nextGreaterElements2(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int len = nums.length;
        int ans[] = new int[len];

        for (int i = 2 * len - 1; i >= 0; i--) {
            int idx = i % len;
            while (st.size() != 0 && nums[idx] >= st.peek()) {
                st.pop();
            }
            if (i < len) {
                if (st.size() == 0) {
                    ans[idx] = -1;
                } else {
                    ans[idx] = st.peek();
                }
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}
