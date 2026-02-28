package BinarySearchTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class getAllElements {
    public class TreeNode {
        TreeNode left, right;
        int val;
    }
    public void inorder(TreeNode root1, List<Integer> list) {
        if (root1 == null) return;
        inorder(root1.left, list);
        list.add(root1.val);
        inorder(root1.right, list);
    }
    public List<Integer> getAll(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        inorder(root1, list);
        inorder(root2, list);
        Collections.sort(list);
        return list;
    }
}
