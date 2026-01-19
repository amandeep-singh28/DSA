import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKelements {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        
        System.out.println(q1); // 1 2 3 4 5 

        int k = 3;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 3; i++) {
            st.push(q1.remove());
        }

        while (st.size() != 0) {
            q1.add(st.pop());
        }
    

        int size = q1.size() - k;
        while (size > 0) {
            q1.add(q1.remove());
            size--;
        }
        System.out.println(q1);
    }
}
