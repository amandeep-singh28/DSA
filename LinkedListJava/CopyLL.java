class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CopyLL {
    public static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node copyLL(Node head) {
        Node temp1 = head;
        Node copyLL = new Node(-1);
        Node temp2 = copyLL;

        while (temp1 != null) {
            temp2.next = new Node(temp1.data);
            temp2= temp2.next;
            temp1 = temp1.next;
        }
        return copyLL.next;

    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        displayLL(a);
        Node head = copyLL(a);
        displayLL(head);
    }
}
