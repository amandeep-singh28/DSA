import java.util.*;

public class basicSTL {
    public static void main(String[] args) {
        // Queue<Integer> q1 = new ArrayDeque<>();
        // Queue<Integer> q2 = new PriorityQueue<>();
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.add(40);
        System.out.println(q.element());
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.isEmpty());
        
        // q.poll(); same as remove()
        q.remove();
        System.out.println(q.element());
        System.out.println(q);
        System.out.println(q.size());

        
    }
}
