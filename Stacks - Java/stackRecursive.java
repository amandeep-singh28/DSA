import java.util.Stack;

public class stackRecursive {
    public static void displayRecursive(Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        displayRecursive(st);
        pushBottom(st, top);
    }
    public static void pushBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushBottom(st, x);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        System.out.println(st);
        displayRecursive(st);
        System.out.println(st);

    }    
}
