package Strings;

public class reverseWordsIII {
    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb1.append(s.charAt(i));
            } else {
                sb2.append(sb1.reverse());
                sb2.append(" ");
                sb1.setLength(0);
            }
        }
        sb2.append(sb1.reverse());
        System.out.println(sb2);
    }
}
