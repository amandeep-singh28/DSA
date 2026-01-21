// All the functions in the list interface will be applicable to every class of that interface (Array List, Vector, LinkedList) -> Same for other interface
import java.util.LinkedList;

public class frameworkLinkedList {
    static void ArrayListExamples() {
        LinkedList<Integer> l = new LinkedList<>();
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
