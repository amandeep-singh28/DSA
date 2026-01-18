import java.util.Scanner;
import java.util.Stack;

public class isbalanced {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;
                if (st.peek() == '(' || st.peek() == '[' || st.peek() == '{') st.pop();
            }
        }
        if (st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));

        sc.close();
    }
}
