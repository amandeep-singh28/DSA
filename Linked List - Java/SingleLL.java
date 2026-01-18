import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLL {
    static Node head = null;
    static Node temp = null;
    static Node prevNode = null;
    public static Node creationLL(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Data");
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public static Node insertAtBeginning(Node head, Scanner sc) {
        System.out.println("Enter the data you want to insert at beginning:");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, Scanner sc) {
        System.out.println("Enter the data you want to insert at end:");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, Scanner sc) {
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        System.out.println("Enter the data which you want to add at the poition:");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        int count = 1;
        temp = head;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node deleteFromBeginning(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return null;
        }
        temp = head;
        head = temp.next;
        return head;
    }

    public static Node deleteFromEnd(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return null;
        }
        if (head.next == null) {
            return null;
        }
        temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteFromPosition(Node head, Scanner sc) {
        System.out.println("Enter the position you want to delete the node:");
        int pos = sc.nextInt();
        int count = 1;
        temp = head;

        if (pos == 1) {
            head = deleteFromBeginning(head);
            return head;
        }

        while (count < pos) {
            prevNode = temp;
            temp = temp.next;
            count++;
        }
        prevNode.next = temp.next;
        return head;
    }

    public static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode; 
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
        return head;
    }

    public static void findMiddleElement(Node head) {
        Node turtle = head;
        Node hare = head;

        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        System.out.println(turtle.data);
    }
    
    public static Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void searchElement(Node head, Scanner sc) {
        if (head == null) {
            return;
        }

        System.out.println("Enter the element which you want to search:");
        int element = sc.nextInt();
        
        while (head != null) {
            if (head.data == element) {
                System.out.println("Element found");
                return;
            }
            head = head.next;
        }
        System.out.println("Element not found");
    }

    public static void searchRecursiveElement(Node head, int element) {
        if (head == null) {
            System.out.println("Element not found");
            return;
        }
        if (head.data == element) {
            System.out.println("Element Found");
            return;
        }
        searchRecursiveElement(head.next, element);
    }

    public static Node nthLastDelete(Node head, int n){

        if (head.next == null) {
            return null;
        }

        int size = 0;
        temp = head;
        
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int position = size - n;
        Node prevNode = head;
        int counter = 1;
        while (counter < position) {
            prevNode = prevNode.next;
            counter++;
        } 
        prevNode.next = prevNode.next.next;
        return head;

    }

    public static void displayLL(Node head) {
        temp = head;
        System.out.println("Displaying Linked List");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void recursiveDisplay(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        recursiveDisplay(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        head = creationLL(n, sc);
        // recursiveDisplay(head);
        // head = insertAtBeginning(head, sc);
        // displayLL(head);
        // head = insertAtEnd(head, sc);
        // displayLL(head);
        // head = insertAtPosition(head, sc);
        // displayLL(head);
        
        
        // head = deleteFromBeginning(head);
        // displayLL(head);
        // head = deleteFromEnd(head);
        // displayLL(head);
        // head = deleteFromPosition(head, sc);
        // displayLL(head);
        
        // head = reverseLL(head);
        // displayLL(head);

        // head = reverseRecursive(head);
        // displayLL(head);

        // searchElement(head, sc);

        // System.out.println("Enter the element which you want to search:");
        // int element = sc.nextInt();
        // searchRecursiveElement(head, element);

        // displayLL(head);
        // System.out.println("Enter the position at which you want to delete:");
        // int pos = sc.nextInt();
        // head = nthLastDelete(head, pos);
        // displayLL(head);

        displayLL(head);
        findMiddleElement(head);
    }
}