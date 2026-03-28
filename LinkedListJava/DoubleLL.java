import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLL {
    static Node head = null;
    static Node tail = null;
    static Node temp = null;
    public static Node creation(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data:");
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        return head;
    }

    public static Node insertAtBeginning(Node head, Scanner sc) {
        System.out.println("Enter data you want to insert at beginning:");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtLast(Node head, Scanner sc) {
        System.out.println("Enter data you want to insert at end");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        tail.next = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, Scanner sc) {
        
        if (head == null) {
            head = insertAtBeginning(head, sc);
            return head;
        }

        System.out.println("Enter the position at which you want to insert the data:");
        int position = sc.nextInt();
        int count = 1;

        temp = head;
        while (count < position - 1) {
            temp = temp.next;
            count++;
        }

        System.out.println("Enter data:");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        temp.next.prev = newNode;

        return head;
    }

    public static void display(Node head) {
        temp = head;
        System.out.println("Displaying Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of nodes:");
        int n = sc.nextInt();
        head = creation(n, sc);
        // display(head);

        // head = insertAtBeginning(head, sc);
        // display(head);

        // head = insertAtLast(head, sc);
        // display(head);

        head = insertAtPosition(head, sc);
        display(head);
    }
}