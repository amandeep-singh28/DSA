package HashSet;

import java.util.HashSet;

public class longestConsecutiveSubseq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int val : nums) {
            hs.add(val);
        }
        int maxStreak = 0;

        for (int val : hs) {
            if (!hs.contains(val - 1)) {
                int currNum = val;
                int streak = 1;
                while (hs.contains(currNum + 1)) {
                    streak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, streak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        
    }
}
