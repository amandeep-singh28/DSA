public class circularqueue {
    public static class Cqa {
        int rear, front = -1;
        int size = 0;
        int[] arr = new int[5];

        public void push(int data) throws Exception{
            if (size == arr.length) {
                throw new Exception("Queue is full!!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = data;
            }
            else if (rear < arr.length - 1) {
                rear++;
                arr[rear] = data;
            }
            else if (rear == arr.length - 1) {
                rear = 0;
                arr[rear] = data;
            }
            size++;
        }
        
        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!!");
            }
            else {
                int value = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;     
                }
                size--;
                return value;
            }
        }

        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!!");
            }
            else {
                return arr[front];
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!!");
            }
            else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); //   2 3 4
        q.push(5);
        q.display(); //   2 3 4 5
        q.push(6);
        q.display(); // 6 2 3 4 5 -> 2 3 4 5 6
        // q.push(7);
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i] + " "); // 6 2 3 4 5
        }

    }
}
