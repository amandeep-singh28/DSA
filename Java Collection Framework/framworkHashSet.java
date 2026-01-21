import java.util.HashSet;

public class framworkHashSet {
    static void example1() {
HashSet<Integer> st = new HashSet<>();
        // Unordered and Unique elements in HashSet
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); // 1, 2, 3
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); // 1, 2, 3
        st.remove(2);
        System.out.println(st); // 1, 3
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); // 2
    }
    public static void main(String[] args) {
        example1();
    }
}
