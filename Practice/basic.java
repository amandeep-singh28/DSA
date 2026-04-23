package Practice;

public class basic {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length() - 1;

        while (s.charAt(length) == ' ' && length >= 0) length--;

        for (int i = length; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') count++;
            else break;
        }
        return count;
    }
}
