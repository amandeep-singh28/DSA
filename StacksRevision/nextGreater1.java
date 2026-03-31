package StacksRevision;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextGreater1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans[] = new int[nums1.length];
        Arrays.fill(ans, -1);
        for (int i = 0; i < len1; i++) {
            int idx = -1;
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    idx = j;
                    break;
                }
            }
            for (int j = idx; j < len2; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }

    public int[] nextGreaterElementApproach2(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans[] = new int[len2];
        Stack<Integer> st = new Stack<>();
        ans[len2 - 1] = -1;
        st.push(nums2[len2 - 1]);

        for (int i = len2 - 2; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(nums2[i]);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < len2; i++) {
            hm.put(nums2[i], ans[i]);
        }
        
        int newAns[] = new int[len1];
        for (int i = 0; i < len1; i++) {
            newAns[i] = hm.get(nums1[i]);
        }
        return newAns;
    }
}
