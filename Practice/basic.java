package Practice;


public class basic {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int len1 = s.length();
        for (int i = 0; i < len1; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int element = ch + 32;
                sb.append((char)element);
            } else sb.append(ch);
        }
        return sb.toString();
    }
}
