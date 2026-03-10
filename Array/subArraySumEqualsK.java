public class subArraySumEqualsK {
    public int subarraySum(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum +=  nums[j];
                if (sum == target) count++;
            }
        }
        return count;
    }
}
