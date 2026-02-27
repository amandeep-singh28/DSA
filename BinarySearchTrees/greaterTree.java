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
    // static int sum = 0;
    public void reverseInorderTraversal(TreeNode root, int[] sum) {
        if (root == null) return;
        reverseInorderTraversal(root.right, sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        reverseInorderTraversal(root.left, sum);
    }
    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        // sum = 0;
        reverseInorderTraversal(root, sum);
        return root;
    }
}
