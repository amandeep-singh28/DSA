import java.util.LinkedList;
import java.util.Queue;

/*public class Revision {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        // System.out.println(q1); 

        Queue<Integer> q2 = new LinkedList<>();
        while(q1.size() != 0) {
            int element = q1.poll();
            System.out.println(element);
            q2.add(element);
        }

        System.out.println(q1);
        while (q2.size() != 0) {
            q1.add(q2.poll());
        }

        System.out.println(q1);
    }    
}*/

public class Revision {
    public static class queueArray {
        int front = -1, rear = -1, size = 0;
        int array[] = new int[100];

        public void add(int value) {
            if (rear == array.length - 1) {
                System.out.println("Queue is full!!");
                return;
            }
            if (front == -1) {
                front = rear = 0;
                array[0] = value;
            } else {
                rear++;
                array[rear] = value;
            }
            size++;
        }

        public void remove() {
            if (size == 0){
                System.out.println("Queue is empty!!");
                return;
            }
            System.out.println("Element Removed:" + array[front]);
            front++;
            size--;
        }

        public void peek() {
            if (size == 0){
                System.out.println("Queue is empty!!");
                return;
            }
            System.out.println("Top Element:" + array[front]);
        }

        public void display() {
            if (size == 0){
                System.out.println("Queue is empty!!");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.remove();
        q.display();
        q.peek();
    }
}
