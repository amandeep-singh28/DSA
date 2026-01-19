import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> dq2 = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        System.out.println(dq);


        dq2.addLast(1);
        dq2.addLast(2);
        dq2.addLast(3);
        dq2.addLast(4);
        System.out.println(dq2);

        dq.add(5); // Peeche se add krega -> Normal behaviour of queue
        dq2.add(5);
        System.out.println(dq);
        System.out.println(dq2);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        dq.remove(); // Aage se remove
        System.out.println(dq);

        Deque<Integer> d3 = new LinkedList<>();
        d3.add(1);
        d3.add(2);
        d3.add(1);
        d3.add(5);
        d3.removeFirstOccurrence(1);
        System.out.println(d3);
        
    }
}
