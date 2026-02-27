package BinarySearchTrees;



public class findPredSuc {
    static Node temp = null;    
    static int pred = -1;
    static int succ = -1;
    static boolean flag = false;

    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void inorder(Node root, int val) {
        if (root == null) return;
        inorder(root.left, val);
        if (temp == null) temp = root;
        else {
            if (root.val == val) {
                pred = temp.val;
                flag = true;
            } else if (root.val > val && flag == true) {
                succ = root.val;
                flag = false;
            } else {
                temp = root;
            }
        }
        inorder(root.right, val);

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
        
        int val = 10;
        inorder(root, val);
        System.out.println("Pred: "+ pred);
        System.out.println("Suc: "+ succ);
    }
}
