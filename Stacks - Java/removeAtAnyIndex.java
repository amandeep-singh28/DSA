import java.util.Stack;

public class removeAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int index = 4;

        Stack<Integer> gt = new Stack<>();
        while (st.size() > index + 1) {
            gt.push(st.pop());
        }
        st.pop();
    
        while (gt.size() > 0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }    
}
