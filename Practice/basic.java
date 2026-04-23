package Practice;

import java.util.HashMap;

public class basic {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put(s.charAt(0), 0);
        int maxlen = 1;
        int length1 = s.length();
        int left = 0;
        int right = 0;
        for (int i = 1; i < length1; i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch) == false) {
                hm.put(ch, i);
                right++;
                maxlen = Math.max(maxlen, right - left + 1);
            } else {
                int freq = hm.get(ch);
                hm.put(ch, i);
                right++;
                left = Math.max(left, freq + 1);
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }
        return maxlen;
    }
}
