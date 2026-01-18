public class arrayImplementation {
    public static class queueArray {
        int front = -1, rear = -1;
        int size = 0;
        int[] arr = new int[4];

        public void add(int element) {
            if (size == arr.length) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
                arr[rear] = element;
            } else {
                rear++;
                arr[rear] = element;
            }
            size = size + 1; 
        }
        public void remove() {
            if (size == 0) {
                System.out.println("Queue Is Empty!!");
                return;
            }
            front++;
            size--;
        }
        public void peek() {
            if (size == 0) {
                System.out.println("Queue Is Empty!!");
                return;
            }
            System.out.println("Peek Element:" + arr[front]);
        }
        public void display() {
            if (size == 0) {
                System.out.println("Queue Is Empty!!");
            }
            else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        queueArray q1 = new queueArray();
        q1.add(10); 
        q1.add(20); 
        q1.add(30); 
        q1.add(40); 
        q1.add(50); // Queue is full
        q1.display();
        q1.peek();
        q1.remove();
        q1.remove();
        q1.remove();
        q1.remove();
        q1.display();
        q1.display();
        q1.display();
    }
}
