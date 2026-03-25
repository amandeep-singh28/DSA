package StacksRevision;
import java.util.*;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        //display stack without using System.out.println(st)
        // (i) With the help of another stack
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            gt.push(st.pop());
        }

        while (gt.size() > 0) {
            int top = gt.pop();
            System.out.print(top + " ");
            st.push(top);
        }
    }
}
