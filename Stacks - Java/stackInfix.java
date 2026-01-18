import java.util.Stack;

public class stackInfix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Since its a string, we need to calculate its ASCII value
            int ascii = (int)ch;
            // '0' -> 48 and '9' -> 57
            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48); // '5' -> 53, 53 - 48 -> 5 (st -> push)
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                     int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '-') st.push(v1 - v2);
                    if (op.peek() == '+') st.push(v1 + v2);
                    if (op.peek() == '*') st.push(v1 * v2);
                    if (op.peek() == '/') st.push(v1 / v2);
                    op.pop();
                }
                op.pop();

            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '-') st.push(v1 - v2);
                    if (op.peek() == '+') st.push(v1 + v2);
                    if (op.peek() == '*') st.push(v1 * v2);
                    if (op.peek() == '/') st.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if (op.peek() == '*') st.push(v1 * v2);
                        if (op.peek() == '/') st.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        while (st.size() > 1) {
            int v2 = st.pop();
            int v1 = st.pop();

            if (op.peek() == '-') st.push(v1 - v2);
            if (op.peek() == '+') st.push(v1 + v2);
            if (op.peek() == '*') st.push(v1 * v2);
            if (op.peek() == '/') st.push(v1 / v2);

            op.pop();
        }
        System.out.println(st.peek());

    }
}
