public class linkedListImplementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Stack {
        Node head = null;

        int size = 0;
        void push(int x) {
            Node a = new Node(x);
            a.next = head;
            head = a;
            size++;
        }
        void peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Top element -> " + head.data);
        }
        void pop() {
            head = head.next;
        }
        void display() {
            Node temp = head; 
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRec(Node head) {
            if (head == null) return;
            int top = head.data;
            System.out.print(top + " ");
            displayRec(head.next);
        }
    }
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(30);
        st.display();
        st.push(40);
        st.display();
        
        st.peek();
        
        st.pop();
        st.display();

        st.displayRec(st.head);
        
    }
}
