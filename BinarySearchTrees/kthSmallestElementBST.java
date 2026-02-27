package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class kthSmallestElementBST {
    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

    }
    
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);
    }
}
