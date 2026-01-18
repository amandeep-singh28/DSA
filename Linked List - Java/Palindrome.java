import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
    }
}

public class Palindrome {
    static Node head = null;
    static Node temp = null;

    public static Node creationLL(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data:");
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                temp = head = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public static void displayLL(Node head) {
        temp = head;
        System.out.println("Linked List");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            
        }
        return turtle;
    }

    public static Node reverse(Node head) {
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }

        return prevNode;
    }

    public static boolean palindromeLL(Node head) {
        Node middle = findMiddle(head);        
        
        Node firstStart = head;
        Node secondStart = reverse(middle.next);
        
        while (secondStart != null) {
            if (secondStart.data != firstStart.data) {
                return false;
            }
            firstStart = firstStart.next;
            secondStart = secondStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        head = creationLL(n, sc);
        displayLL(head);
        System.out.println(palindromeLL(head));
    }
}
