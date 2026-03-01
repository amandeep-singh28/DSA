package BinarySearchTrees;

public class rangeSum {
    public class TreeNode {
        TreeNode left, right;
        int val;
    }
    // static int sum = 0;
    public void inorder(TreeNode root, int low, int high, int[] sum) {
        if (root == null) return;
        inorder(root.left, low, high, sum);
        if (root.val >= low && root.val <= high) sum[0] += root.val;
        inorder(root.right, low, high, sum);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        // sum = 0;
        int[] sum = new int[1];
        inorder(root, low, high, sum);
        return sum[0];
    }
}
