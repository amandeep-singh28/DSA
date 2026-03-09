public class rangeSumQuery {
    class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = nums[i];
            // System.out.print(prefix[i] + " ");
        }
        prefixSum(prefix);
    }
    public void prefixSum(int prefix[]) {
        prefix[0] = prefix[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] += prefix[i - 1];
        }
    }
    public int sumRange(int left, int right) {
        
        
        if (left >= 1) return prefix[right] - prefix[left - 1];
        else return prefix[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}
