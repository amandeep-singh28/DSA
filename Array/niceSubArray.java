public class niceSubArray {
    public int helper(int nums[], int goal) {
        if (goal < 0) return 0;
        int right = 0, left = 0, count = 0, sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            count = count + (right - left + 1);
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) nums[i] = 0;
            else nums[i] = 1;
        }
        // int count = helper(nums, num);
        // int count1 = helper(nums, num - 1);
        // return count - count1;
        return helper(nums, num) - helper(nums, num - 1);
    }
}
