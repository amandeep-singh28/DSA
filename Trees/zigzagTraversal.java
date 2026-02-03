package Trees;

public class zigzagTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node (int val) {
            this.val = val;
        }
    }
    public static int height(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void nthtraversal1(Node root, int n) {
        if (root == null) return;
        if (n == 1) System.out.print(root.val + " ");
        nthtraversal1(root.left, n - 1); 
        nthtraversal1(root.right, n - 1); 
    }
    public static void nthtraversal2(Node root, int n) {
        if (root == null) return;
        if (n == 1) System.out.print(root.val + " ");
        nthtraversal2(root.right, n - 1); 
        nthtraversal2(root.left, n - 1); 
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

        int height = height(root) + 1;
        System.out.println("Height of the tree:" + height);

        for (int i = 1; i <= height; i++) {
            if (i % 2 == 0) nthtraversal2(root, i);
            else nthtraversal1(root, i);
            System.out.println();
        }
        
    }
}
