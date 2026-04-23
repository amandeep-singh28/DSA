package Practice;


public class basic {
    public String reverseWords(String s) {
        int length1 = s.length();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < length1 ; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                sb1.append(ch);
            } else {
                sb2.append(sb1.reverse());
                sb2.append(' ');
                sb1.setLength(0);
            }
        }
        sb2.append(sb1.reverse());
        return sb2.toString();
    }
}
