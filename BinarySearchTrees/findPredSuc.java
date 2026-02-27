package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class findPredSuc {    
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void inorder(Node root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
    public static void main(String[] args) {
        Node root = new Node(34);

        Node a = new Node(17);
        Node b = new Node(60);
        Node c = new Node(14);
        Node d = new Node(28);
        Node e = new Node(55);
        Node f = new Node(70);
        Node g = new Node(10);
        Node h = new Node(20);
        Node i = new Node(50);
        Node j = new Node(89);

        // Connecting nodes

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        c.left = g;

        d.left = h;

        e.left = i;

        f.right = j;
        List<Integer> list = new ArrayList<>();
        
        inorder(root, list);

        int val = 17;
        int idx = -1;
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) == val) {
                idx = k;
            }
        }
        System.out.println(list);
        System.out.println("Pred: "+ list.get(idx - 1));
        System.out.println("Suc: "+ list.get(idx + 1));
    }
}
