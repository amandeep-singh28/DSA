import java.util.Stack;

public class makeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (st.size() == 0 || st.peek() != (char)(ch + 32) && st.peek() != (char)(ch - 32)) {
                st.push(ch);
            } else {
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        // int anslen = st.size();
        // char[] charArray = new char[anslen];
        // for (int i = anslen - 1; i >= 0; i--) {
        //     charArray[i] = st.pop();
        // }
        // for (int i = 0; i < charArray.length; i++) {
        //     sb.append(charArray[i]);
        // }
        // return sb.toString();
        while (st.size() != 0) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
