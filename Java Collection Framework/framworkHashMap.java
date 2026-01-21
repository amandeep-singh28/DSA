import java.util.HashMap;

public class framworkHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Ravi");
        mp.put(2, "Riya");

        //Iterating over keys in a map
        for (Integer i : mp.keySet()){
            System.out.println(i);
        }

        //Iterating over values in a map
        for (var i : mp.values()) { // If we will use var than we don't need to specify any data types
            System.out.println(i);
        }

        //Iterate over the key, value mapping
        for (var e : mp.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // mp.put(3, "Amandeep"); // It will update
        // mp.putIfAbsent(1, "Amandeep Singh");
        // System.out.println(mp);
        // System.out.println(mp.get(2)); // Riya
        // System.out.println(mp.containsKey(4)); // false
        // System.out.println(mp.containsValue("Aman")); // true
        // System.out.println(mp.entrySet());
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
    }
}
