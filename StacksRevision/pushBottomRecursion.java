package StacksRevision;
import java.util.*;

public class pushBottomRecursion {
    public static void recursion(Stack<Integer> st, int value) {
        if (st.size() == 0) {
            st.push(value);
            return;
        }
        int top = st.pop();
        recursion(st, value);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        int value = 20;
        System.out.println(st);
        recursion(st, value);
        System.out.println(st);
    }
}
