import java.util.LinkedHashMap;

public class frameworkLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();
        // It is ordered
        mp.put(3, "Aman");
        mp.put(1, "Ravi");
        mp.put(2, "Riya");
        System.out.println(mp);
    }
}
