package Practice;

public class basic {
    public static void main(String[] args) {
        String s = "AmANdEeP";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int ele = ch + 32;
                ans += (char)ele;
            } else {
                int ele = ch - 32;
                ans += (char)ele;
            }
        }
        System.out.println(s);
        System.out.println(ans);
    }
}
