// Processing is based upon priority

import java.util.PriorityQueue;

public class frameworkPriorityQueue {
    static void PriorityQueueExamples() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // By default Minimum Priority Queue is made
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 - the smallest element has the highest priority
        System.out.println(pq); // Gurantee - topmost priority element will be processed first
        System.out.println(pq.poll()); // 5
        System.out.println(pq); // Now the topmost element will be 7

    }
    public static void main(String[] args) {
        PriorityQueueExamples();
    }
}
