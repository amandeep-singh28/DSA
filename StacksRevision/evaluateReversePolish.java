package StacksRevision;

import java.util.Stack;

public class evaluateReversePolish {
    public int evalRPN(String[] string) {
        Stack<Integer> st = new Stack<>();
        int strLen = string.length;
        for (int i = 0; i < strLen; i++) {
            String token = string[i];
            if (token.length() > 1 || Character.isDigit(token.charAt(0))) {
                st.push(Integer.parseInt(token));
            } else {
                char ch = token.charAt(0);
                int v2 = st.pop();
                int v1 = st.pop();
                if (ch == '+') st.push(v1 + v2);
                if (ch == '-') st.push(v1 - v2);
                if (ch == '*') st.push(v1 * v2);
                if (ch == '/') st.push(v1 / v2);
            }
        }
        return st.peek();
    }
}
