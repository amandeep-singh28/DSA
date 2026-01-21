import java.util.TreeMap;

public class frameworkTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        // Sorted on the basis of keys in ascending order
        mp.put(3, "Aman");
        mp.put(1, "Ravi");
        mp.put(2, "Riya");
        System.out.println(mp);
    }
}
