import java.util.LinkedHashSet;

public class frameworkLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        // Order is preserved
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
