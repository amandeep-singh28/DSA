package BinarySearchTrees;

public class minDiff {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }

    }
    
    static int minDiff = Integer.MAX_VALUE;
    static TreeNode prev = null;
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) {
            int diff = (root.val - prev.val);
            minDiff = Math.min(minDiff, diff);
        }
        prev = root;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }
}
