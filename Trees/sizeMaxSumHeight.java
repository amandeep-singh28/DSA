package Trees;

public class sizeMaxSumHeight {
    public static class Node {
        int val; 
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int maximum(Node root) {
        if (root == null) return 0; // This thing will not work for the negative values, because whenever we will get leaf node 0 will be returned and when we will compare 0 with other negative values, 0 will become the greatest and 0 will be returned
        int a = root.val;
        int b = maximum(root.left);
        int c = maximum(root.right);
        return Math.max(a, Math.max(b, c));
        
    }
    public static int maximumNegative(Node root) {
        if (root == null) return Integer.MIN_VALUE; // FIX
        int a = root.val;
        int b = maximumNegative(root.left);
        int c = maximumNegative(root.right);
        return Math.max(a, Math.max(b, c));
        
    }
    public static int minimum(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minimum(root.left);
        int c = minimum(root.right);
        return (Math.min(a, Math.min(b, c)));
    }
    public static int product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * product(root.right); 
    }
    public static int edgeHeight(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return (1 + Math.max(edgeHeight(root.left), edgeHeight(root.right)));
    }
    public static void main(String[] args) {
        Node root = new Node(-1);
        Node a = new Node(-2);
        Node b = new Node(-3);

        root.left = a;
        root.right = b;

        Node c = new Node(-2);
        Node d = new Node(-2);

        a.left = c;
        a.right = d;

        Node e = new Node(-2);
        b.right = e;

        Node f = new Node(-2);
        e.left = f;

        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(maximum(root));
        System.out.println(maximumNegative(root));
        System.out.println(edgeHeight(root));
        System.out.println(minimum(root));
        System.out.println(product(root));
    }
}
