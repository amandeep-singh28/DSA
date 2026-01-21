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
    static void example2() { // Concept for Unordered
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
        // It means that order is completely random, it doesn't gurantees that the order in which element are inserted are expected to be in same order in output
    }
    public static void main(String[] args) {
        // example1();
        example2();
    }
}
