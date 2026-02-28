package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class morrisTraversal {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            if (curr.left != null) { //find pred
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) { // make connection
                    pred.right = curr;
                    curr = curr.left;
                }
                if (pred.right == curr) { // break connection
                    pred.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            } else { // no pred -> curr.left == null
                list.add(curr.val);
                curr = curr.right;
            }
        }
        return list;
    }
}
