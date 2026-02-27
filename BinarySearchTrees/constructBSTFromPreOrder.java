package BinarySearchTrees;

public class constructBSTFromPreOrder {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }

    }
    public TreeNode insertBST(TreeNode root, int val) {
        if (root == null) return null;
        if (val > root.val) {
            if (root.right == null) root.right = new TreeNode(val);
            else insertBST(root.right, val); 
        } else if (val < root.val) {
            if (root.left == null) root.left = new TreeNode(val);
            else insertBST(root.left, val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            root = insertBST(root, preorder[i]);
        }
        return root;
    }
}
