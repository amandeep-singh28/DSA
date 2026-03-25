package StacksRevision;
import java.util.*;

public class printingParticularElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2); // We want to access this
        st.push(3);
        st.push(4);

        while (st.size() > 2) {
            st.pop();
        }
        System.out.println("Element: " + st.peek());
    }
}
