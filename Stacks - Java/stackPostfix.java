import java.util.Stack;

public class stackPostfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Since its a string, we need to calculate its ASCII value
            int ascii = (int)ch;
            // '0' -> 48 and '9' -> 57
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                st.push(s); // '5' -> 53, 53 - 48 -> 5 (st -> push)
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    st.push(t);
                }
                op.pop();

            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    st.push(t);

                    op.push(ch);

                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        st.push(t);

                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while (st.size() > 1) {
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            st.push(t);
        }
        System.out.println(st.peek());
    }
}
