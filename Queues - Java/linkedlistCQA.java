public class linkedlistCQA {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class CQA {
        Node head, tail = null;
        int size = 0;
        public void push(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        public void remove() {
            head = head.next;
            tail.next = head;
        }

        public void display() {
            if (head == null) {
                System.out.println("Queue is empty!!");
                return;
            }
            Node temp = head;
            while (temp != tail) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String[] args) {
        CQA q = new CQA();
        q.push(1);
        q.push(2);
        q.push(3);
        q.display(); // 1 2 3
        q.remove();
        q.display(); // 2 3
    }
}
