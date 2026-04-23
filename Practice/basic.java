package Practice;

import java.util.Arrays;

public class basic {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int[] freq = new int[256];
        for (int i = 0; i < len1; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < len2; i++) {
            char ch = t.charAt(i);
            freq[ch - 'a']--;
        }

        for (int element : freq) {
            if (element != 0) return false;
        }
        return true;
    }
}
