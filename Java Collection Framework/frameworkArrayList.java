import java.util.ArrayList;

public class frameworkArrayList {
    static void ArrayListExamples() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1, 2, 3
        System.out.println(l.get(1)); // 0 - based indexing
        l.set(1, 10); // modify at index 1
        System.out.println(l);
        System.out.println(l.contains(10)); // true
    }
    public static void main(String[] args) {
        ArrayListExamples();
    }    
}
