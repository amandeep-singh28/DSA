package TreesRevision;

public class creation {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void displayTree(Node root) {
        if (root == null) return;
        System.out.print(root.val + "->");
        if (root.left != null) System.out.print(root.left.val + " ");
        if (root.right != null) System.out.print(root.right.val + " ");
        System.out.println();
        displayTree(root.left);
        displayTree(root.right);
    }
    public static int sizeTree(Node root) {
        if (root == null) return 0;
        return 1 + sizeTree(root.left) +  sizeTree(root.right);
    }
    public static int maxValue(Node root) {
        if (root == null) return 0;
        int a = root.val;
        int b = maxValue(root.left);
        int c = maxValue(root.right);
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        displayTree(a);
        System.out.println("Size of Tree:" + sizeTree(a));
        System.out.println("Maximum Value:" + maxValue(a));
    }
}
