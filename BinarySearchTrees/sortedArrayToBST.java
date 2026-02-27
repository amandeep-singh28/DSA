package BinarySearchTrees;

public class sortedArrayToBST {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode (int val) {
            this.val = val;
        }

    }
    public TreeNode constructTree(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructTree(nums, low, mid - 1);
        root.right = constructTree(nums, mid + 1, high);
        return root;
    }
    public TreeNode sortedArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        TreeNode root = constructTree(nums, low, high);
        return root;
    }
}
