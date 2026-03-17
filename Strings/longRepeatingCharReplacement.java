package Strings;

import java.util.HashMap;

public class longRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
                int changes = (j - i + 1) - maxFreq;
                if (changes <= k) maxLen = Math.max(maxLen, j - i + 1);
                else break;
            }
        }
        return maxLen;
    }
    public int characterReplacement2(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int right = 0, left = 0, maxLen = 0, maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)) == false) {
                hm.put(s.charAt(i), 1);
                maxFreq = Math.max(maxFreq, 1);
                int changes = (right - left + 1) - maxFreq;
                if (changes <= k) maxLen = Math.max(maxLen, right - left + 1);
                else {
                    int freq1 = hm.get(s.charAt(left));
                    hm.put(s.charAt(left), freq1 - 1);
                    left++;
                }
                right++;
            } else {
                int freq = hm.get(s.charAt(i));
                hm.put(s.charAt(i), freq + 1);
                maxFreq = Math.max(maxFreq, freq + 1);
                int changes = (right - left + 1) - maxFreq;
                if (changes <= k) maxLen = Math.max(maxLen, right - left + 1);
                else {
                    int freq1 = hm.get(s.charAt(left));
                    hm.put(s.charAt(left), freq1 - 1);
                    left++;
                }
                right++;
            }
        }
        return maxLen;
    }
}
