import java.util.HashMap;

public class Basic {
    static void nullKeyValue() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("",20);
        hm.put("abc",null);
        hm.put("pqr",null);
        hm.put("xyz",null);
        System.out.println(hm);
    }
    public static void main(String[] args) {
        // Syntax
        HashMap<String, Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Nashit", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        //Getting value of a key from the HashMap
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Rahul")); // It will return Null
        //Changing/updating value of a key in the HashMap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));
        //Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Aman")); // null
        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Nashit"));
        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); // will enter
        mp.putIfAbsent("Yash", 30); // will not enter
        //Get all keys in the HashMap
        System.out.println(mp.keySet());
        //Get all values in the HashMap
        System.out.println(mp.values());
        //Get all entries in the HashMap
        System.out.println(mp.entrySet()); 
        //Traversing all entries of HashMap - multiple methods
        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        for (Integer value : mp.values()) {
            System.out.println(value);
        }
        for (HashMap.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        // OR
        for (var e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        nullKeyValue();
    }
}
