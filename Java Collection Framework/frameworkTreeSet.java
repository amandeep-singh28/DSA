import java.util.TreeSet;

public class frameworkTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();
        // Order is preserved in sorted order
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(15);
        st.add(28);
        st.add(18);
        st.add(27);
        st.add(25);
        System.out.println(st);
    }
}
