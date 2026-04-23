package Practice;


public class basic {
    public String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length1 = s.length() - 1;
        while (s.charAt(length1) == ' ' && length1 >= 0) length1--;
        for (int i = length1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb1.append(ch);
            } else if (ch == ' ' && s.charAt(i + 1) != ' '){
                sb2.append(sb1.reverse());
                sb2.append(' ');
                sb1.setLength(0);
            }
        }
        sb2.append(sb1.reverse());
        return sb2.toString().trim();
    }
}
