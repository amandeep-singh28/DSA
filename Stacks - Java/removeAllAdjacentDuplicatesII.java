import java.util.Stack;

public class removeAllAdjacentDuplicatesII {
    public String removeDuplicates(String s, int k) {
        class Pair {
            char ch;
            int count;
            Pair (char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }
        Stack<Pair> st = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (st.size() == 0 || st.peek().ch != ch) {
                st.push(new Pair(ch, 1));
            } else {
                st.peek().count++;
            }
            if (st.peek().count == k) {
                st.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }
}
