package Strings;

import java.util.HashMap;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // int maxLen = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     int[] hash = new int[256];
        //     for (int j = i; j < s.length(); j++) {
        //         if (hash[s.charAt(j)] == 1) break;
        //         int len = j - i + 1;
        //         maxLen = Math.max(maxLen, len);
        //         hash[s.charAt(j)] = 1;
        //     }
        // }
        // return maxLen;

        if (s.length() == 0) return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put(s.charAt(0), 0);

        int right = 0, left = 0, maxLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)) == false) {
                hm.put(s.charAt(i), i);
                right++;
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                left = Math.max(left, hm.get(s.charAt(i)) + 1);
                hm.put(s.charAt(i), i);
                right++;
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
