package Trees;

public class nthLevelTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
        }
    }
    public static void nthtraversal(Node root, int n) {
        if (root == null) return;
        if (n == 1) System.out.print(root.val + " ");
        nthtraversal(root.left, n - 1); // 2, 2 - 1
        nthtraversal(root.right, n - 1); // 3, 2 - 1
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
        nthtraversal(root, 2);
    }
}
