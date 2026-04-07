package TreesRevision;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversalQueue {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void usingQueue(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        e.right = i;
        usingQueue(a);
    }
}
