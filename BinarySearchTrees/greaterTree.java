package BinarySearchTrees;

public class greaterTree {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }

    }
    static int sum = 0;
    public void reverseInorderTraversal(TreeNode root) {
        if (root == null) return;
        reverseInorderTraversal(root.right);
        root.val = root.val + sum;
        sum = root.val;
        reverseInorderTraversal(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        reverseInorderTraversal(root);
        return root;
    }
}
