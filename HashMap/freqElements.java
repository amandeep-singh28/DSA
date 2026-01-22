import java.util.HashMap;

public class freqElements {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 3, 2, 1, 4, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                int prev = hm.get(arr[i]);
                hm.put(arr[i], prev + 1);
            }
        }
        System.out.println(hm.entrySet());

        int maxfreq = 0, anskey = -1;
        for (var e : hm.entrySet()) {
            if (e.getValue() > maxfreq) {
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.printf("%d has occurred %d times", anskey, maxfreq);
    }
}
