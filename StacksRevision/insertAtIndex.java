package StacksRevision;
import java.util.*;

public class insertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        int index = 2, element = 23;
        while (st.size() > index) {
            gt.push(st.pop());
        }
        
        st.push(element);
        while (gt.size() > 0) {
            st.push(gt.pop());
        }

        System.out.println(st);

    }
}
