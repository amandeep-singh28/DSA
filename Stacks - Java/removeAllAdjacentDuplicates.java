import java.util.Stack;

public class removeAllAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (st.size() == 0 || st.peek() != ch) {
                st.push(ch);
            } else {
                st.pop();
            }
        }
        System.out.println(st);
        int anslen = st.size();
        char[] charArray = new char[anslen];
        for (int i = anslen - 1; i >= 0; i--) {
            charArray[i] = st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}
