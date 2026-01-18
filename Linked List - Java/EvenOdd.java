class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class EvenOdd {
    public static void EvenOddList(Node head) {
        Node OddList = new Node(-1);
        Node EvenList = new Node(-1);
        Node temp1 = OddList;
        Node temp2 = EvenList;
        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                Node a = new Node(temp.data);
                temp2.next = a;
                temp2 = a;
                temp = temp.next;
            } else {
                Node b = new Node(temp.data);
                temp1.next = b;
                temp1 = b;
                temp = temp.next;

            }
        }

        displayLL(OddList.next);
        displayLL(EvenList.next);

    }
    public static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(4);
        Node g = new Node(7);
        // Node h = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        // g.next = h;

        displayLL(a);
        EvenOddList(a);
    }
}
