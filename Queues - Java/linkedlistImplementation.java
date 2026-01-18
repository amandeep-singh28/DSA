public class linkedlistImplementation {
    public static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }
    public static class linkedlistQueue {
        Node head = null;
        Node tail = null;
        void push(int element) {
            Node a = new Node(element);
            if (head == null) {
                head = tail = a;
            } else {
                tail.next = a;
                tail = a;
            }
        }

        void peek() {
            if (head == null) {
                System.out.print("Queue is Empty");
                return;
            } else System.out.println("Peek Element:" + head.data);
        }

        void remove() {
            if (head == null) {
                System.out.print("Queue is Empty");
                return;
            } else {
                System.out.println("Element Removed:" + head.data);
                head = head.next;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlistQueue q1 = new linkedlistQueue();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.push(40);
        q1.display();
        q1.peek();
        q1.remove();
        q1.remove();
        q1.remove();
        q1.remove();
        q1.remove();
        q1.display();
    }
}
