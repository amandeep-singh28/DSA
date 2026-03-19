package LinkedListRevision;

import java.util.Scanner;

public class creation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node create(int n, Scanner sc) {
        Node head = null, temp = null;

        for (int i = 0; i < n; i++) {
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

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayReverse(Node head) {
        Node temp = head;
        if (temp == null) return;
        displayReverse(temp.next);
        System.out.print(temp.data + " ");
    }
    public static void reverseIterative(Node head) {
        Node prev = null, curr = null;
        prev = head;
        curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        display(head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        Node head = create(n, sc);
        display(head);
        reverseIterative(head);
    }
}