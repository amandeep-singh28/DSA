package BinarySearchTrees;

public class trimBST {
    public class TreeNode {
        TreeNode left, right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }

    }
    public void helper(TreeNode root, int low, int high) {
        if (root == null) return;
        while (root.left != null) {
            if (low > root.left.val) root.left = root.left.right;
            else if (high < root.left.val) root.left = root.left.left;
            else break; // When low and high are equal, we have to stop trimming
        }

        while (root.right != null) {
            if (high < root.right.val) root.right = root.right.left;
            else if (low > root.right.val) root.right = root.right.right;
            else break; // When low and high are equal, we have to stop trimming
        }
    
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
    public TreeNode trim(TreeNode root, int low, int high) {
        TreeNode parent = new TreeNode(Integer.MAX_VALUE);
        parent.left = root;
        helper(parent, low, high);
        return parent.left;
    }
}
