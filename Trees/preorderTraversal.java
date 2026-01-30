package Trees;

public class preorderTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
        }
    }
    public static void traversal(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        traversal(root.left);
        traversal(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(6);
        b.right = e;
        traversal(root);
    }
}
