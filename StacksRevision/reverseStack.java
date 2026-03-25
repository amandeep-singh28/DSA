package StacksRevision;
import java.util.*;

public class reverseStack {
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void pushAtBottom(Stack<Integer> st, int value) {
        if (st.size() == 0) {
            st.push(value);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, value);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // 1 2 3 4 -> 4 3 2 1
        reverse(st);
        System.out.println(st);

    }
}
