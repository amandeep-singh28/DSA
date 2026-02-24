package BinarySearchTrees;

public class deleteionBST {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    public static void preorderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {

        Node root = new Node(50);
        Node b = new Node(20);
        Node c = new Node(60);
        Node d = new Node(17);
        Node e = new Node(34);
        Node f = new Node(55);
        Node g = new Node(89);
        Node h = new Node(10);
        Node i = new Node(28);
        Node j = new Node(70);
        Node k = new Node(14);


        root.left = b;
        root.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        d.left = h;

        h.right = k;

        e.left = i;

        g.left = j;

        h.right = k;
        preorderTraversal(root);
        System.out.println();
        delete(root, 70);
        preorderTraversal(root);
    }
    private static void delete(Node root, int target) {
        if (root == null) return;
        if (target > root.val) {
            if (root.right == null) return;
            if (root.right.val == target) root.right = null;
            else delete(root.right, target);
        } else if (target < root.val){
            if (root.left == null) return;
            if (root.left.val == target) root.left = null;
            else delete(root.left, target);
        }
    }
}
