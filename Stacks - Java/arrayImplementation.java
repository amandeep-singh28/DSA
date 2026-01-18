public class arrayImplementation {
    public static class Stack {
        private int[] arr = new int[4];
        private int index = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }

            arr[index] = x;
            index++;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[index - 1];
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Is Empty");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        int size() {
            return index;
        }

        void display() {
            for (int i = 0; i <= index - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isFull() {
            if (index == arr.length) return true;
            else return false;
        }

        boolean isEmpty() {
            if (index == 0) return true;
            else return false;
        }

        int capacity() {
            return arr.length;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack(); // Creating Object of the class

        st.push(1);
        st.display(); // 1
        st.push(2);
        st.display(); // 1 2
        st.push(3);
        st.display(); // 1 2 3
        st.push(4);
        st.display(); // 1 2 3 4

        System.out.println(st.size()); // 4

        st.pop();
        st.display(); // 1 2 3
        System.out.println(st.size()); // 3

        st.push(4);
        st.push(5);
        System.out.println(st.isFull());
        st.push(100);

    }
}
