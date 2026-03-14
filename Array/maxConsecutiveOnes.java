public class maxConsecutiveOnes {
    // public int longestOnes(int[] nums, int k) {
    //     int maxLen = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         int count = 0;
    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[j] == 0) count++;
    //             if (count <= k) maxLen = Math.max(maxLen, j - i + 1);
    //             else break;
    //         }
    //     }
    //     return maxLen;
    // }
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0, count = 0;
        for (int i = left; i < nums.length; i++) {
            if (nums[i] == 0) count++;

            right = i;

            if (count <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            else {
                // move left
                while (left < right) {
                    if (nums[left] == 1) left++;
                    else {
                        count--;
                        left++;
                        break;
                    }
                }
            }
        }
        return maxLen;
    }
}
