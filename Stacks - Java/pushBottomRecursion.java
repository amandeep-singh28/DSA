import java.util.Stack;

public class pushBottomRecursion {
    public static void pushRecursion(Stack<Integer> st) {
        if (st.size() == 0) {
            st.push(6);
            return;
        } 
        int top = st.pop();
        pushRecursion(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        
        System.out.println(st);

        pushRecursion(st);
        System.out.println(st);

    }
}
