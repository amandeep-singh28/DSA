import java.util.LinkedList;
import java.util.Queue;

public class Revision {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        // System.out.println(q1); 

        Queue<Integer> q2 = new LinkedList<>();
        while(q1.size() != 0) {
            int element = q1.poll();
            System.out.println(element);
            q2.add(element);
        }

        System.out.println(q1);
        while (q2.size() != 0) {
            q1.add(q2.poll());
        }

        System.out.println(q1);
    }    
}
