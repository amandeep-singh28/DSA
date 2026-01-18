import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10); // 10
        q1.add(20); // 20 10
        q1.add(30); // 30 20 10
        q1.add(40); // 40 30 20 10
        // use extra queue for printing

        Queue<Integer> q2 = new LinkedList<>();

        System.out.println(q1);
        while (q1.size() > 0) {
            int top = q1.remove();
            System.out.print(top + " ");
            q2.add(top);
        }
        System.out.println();

        while (q2.size() > 0) {
            q1.add(q2.remove());
        }
        System.out.println(q1);
    }    
}
