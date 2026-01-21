import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);

        System.out.println(q1);

        Stack<Integer> st = new Stack<>();
        int len = q1.size() / 2;

        //Moved first half of the queue to the stack
        while (q1.size() > len) {
            st.push(q1.remove());
        }
        System.out.println(st);

        //Empty stack and move stack -> queue
        while (st.size() != 0) {
            q1.add(st.pop());
        }
        System.out.println(q1);

        //Move first(2nd) half of the queue to the stack
        while (q1.size() > len) {
            st.push(q1.remove());
        }
        System.out.println(q1);
        System.out.println(st);

        //One by one move st.peek() & q1.peek() to q1
        while (st.size() != 0) {
            q1.add(st.pop());
            q1.add(q1.remove());
        }
        System.out.println(q1);

        //Reversing the elements to get the final outcome
        while (q1.size() != 0) {
            st.push(q1.remove());
        }
        while (st.size() != 0) {
            q1.add(st.pop());
        }
        System.out.println(q1);
    }
}
