public class CircularLL {
    public static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }
    public static void displayLL(Node head) {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static Node deleteHead(Node head) {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        return head.next;
        
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        displayLL(a);
        Node newHead = deleteHead(a);
        displayLL(newHead);

    }
    
}
