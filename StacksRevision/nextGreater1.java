package StacksRevision;
import java.util.Arrays;

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
}
