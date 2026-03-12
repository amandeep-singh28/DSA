package Strings;

public class reverseWordsInString {
    class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = s.length() - 1;

        while (length >= 0 && s.charAt(length) == ' ') length--;

        for (int i = length; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                sb1.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                sb2.append(sb1.reverse());
                sb2.append(" ");
                sb1.setLength(0);
            }
        }
        sb2.append(sb1.reverse());
        return sb2.toString().trim();
    }
}
}