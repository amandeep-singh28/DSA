import java.util.HashMap;

public class fruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int left = 0, right = 0, maxLen = 0;

        for (int i = 0; i < fruits.length; i++) {
            if (hm.size() < 2 || hm.containsKey(fruits[i])) {
                if (hm.containsKey(fruits[i]) == true) {
                    int freq = hm.get(fruits[i]);
                    hm.put(fruits[i], freq + 1);
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                } else {
                    hm.put(fruits[i], 1);
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                }
            } else {
                while (hm.size() >= 2) {
                    int freq = hm.get(fruits[left]);
                    if (freq == 1) {
                        hm.remove(fruits[left]);
                        left++;
                    } else {
                        hm.put(fruits[left], freq - 1);
                        left++;
                    }
                }
                i--;
            }
        }
        return maxLen;
    }
}
