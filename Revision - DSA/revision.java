public class revision {
    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRecursive(head.next);
    }
    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }
    public static Node displayReverseIterative(Node head) {
        Node prev = head;
        Node curr = prev.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            // Updating Links
            prev = curr;
            curr = next;
        }
        // head update
        head.next = null;
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b; // 10 -> 20
        b.next = c; // 10 -> 20 -> 30
        c.next = d; // 10 -> 20 -> 30 -> 40

        // displayRecursive(a);
        // displayReverse(a);
        Node new_head = displayReverseIterative(a);
        display(new_head);
        
    }
}
