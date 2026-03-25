package StacksRevision;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st); // 1 2 3
        System.out.println(st.size()); // 3

        System.out.println("Top element:" + st.peek()); // 3

        st.pop(); // Pops top element // removed 3
        System.out.println(st); // 1 2

    }
}
