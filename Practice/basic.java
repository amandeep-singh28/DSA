package Practice;


public class basic {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') count++;
        }
        if (count == length || count == 0) return true;
        if (count == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) return true;
        return false;
    }
}
