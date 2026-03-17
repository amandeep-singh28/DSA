package Strings;

public class noOfSubString3Char {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            lastSeen[s.charAt(i) - 'a'] = i;
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
                int min = Math.min(lastSeen[0], lastSeen[1]);
                count = count + 1 + Math.min(min, lastSeen[2]);
            }
        }
        return count;
    }
}
