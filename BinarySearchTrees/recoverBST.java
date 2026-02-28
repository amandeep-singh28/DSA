package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class recoverBST {
    public class TreeNode {
        TreeNode left, right;
        int val;
    }
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode prevprev = null;
        List<TreeNode> list = new ArrayList<>();
        
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
                    if (prevprev != null && prev != null) {
                        if (prev.val > curr.val && prev.val > prevprev.val) list.add(prev);
                        if (prev.val < curr.val && prev.val < prevprev.val) list.add(prev);
                    } else if (prev != null) {
                        if (prev.val > curr.val) list.add(prev);
                    }
                    prevprev = prev;
                    prev = curr;
                    curr = curr.right;
                }
            } else { // no pred -> curr.left == null
                if (prevprev != null && prev != null) {
                        if (prev.val > curr.val && prev.val > prevprev.val) list.add(prev);
                        if (prev.val < curr.val && prev.val < prevprev.val) list.add(prev);
                    } else if (prev != null) {
                        if (prev.val > curr.val) list.add(prev);
                    }
                prevprev = prev;
                prev = curr;
                curr = curr.right;
            }
        }
        if (prevprev.val > prev.val) list.add(prev);

        int size = list.size();
        TreeNode first = list.get(0);
        TreeNode second = list.get(size - 1);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
