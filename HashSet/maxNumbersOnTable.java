package HashSet;

import java.util.HashSet;

public class maxNumbersOnTable {
    public static int maxNumbers(int bag[], int n) {
        int max = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < bag.length; i++) {
            if (hs.contains(bag[i])) {
                hs.remove(bag[i]);
            } else {
                hs.add(bag[i]);
                max = Math.max(max, hs.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n = 3;
        int arr[] = {2, 1, 1, 3, 2, 3};
        System.out.println(maxNumbers(arr, n));
    }
}
