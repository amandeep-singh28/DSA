package Practice;

import java.util.Arrays;

public class basic {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }
}
