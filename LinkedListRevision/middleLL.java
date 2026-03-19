package LinkedListRevision;

public class middleLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void findMiddle(Node head) {
        Node turtle = head, hare = head;
        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        System.out.println(turtle.data);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        findMiddle(a);
    }
}
