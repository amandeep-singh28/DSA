public class binarySubArraySumEqK {
    public int helper(int[] nums, int goal) {
        if (goal < 0) return 0;
        int left = 0, right = 0, count = 0, sum = 0;
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
    public int numSubarraysWithSum(int[] nums, int goal) {
       int count1 = helper(nums, goal);
       int count2 = helper(nums, goal - 1);
       return count1 - count2;
    }
}
