import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeNumberWindow {
    public static void main(String[] args) {
        // int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        // int k = 3;
        // int size = arr.length;
        // int res[] = new int[size - k + 1];

        // for (int i = 0; i < size - k + 1; i++) {
        //     boolean found = false;
        //     for (int j = 0; j < k; j++) {
        //         if (arr[i + j] < 0) {
        //             res[i] = arr[i + j];
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (found == false) {
        //         res[i] = 0;
        //     }
        // }

        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i] + " ");
        // }

        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
            int size = arr.length;
            int res[] = new int[size - k + 1];

            Queue<Integer> q1 = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                if (arr[i] < 0) {
                    q1.add(i);
                }
            }
            System.out.println(q1);

            for (int i = 0; i < size - k + 1; i++) {
                if (q1.size() > 0 && q1.peek() < i) {
                    q1.remove();
                }
                if (q1.size() > 0 && q1.peek() <= i + k - 1) {
                    res[i] = arr[q1.peek()];
                }
                else if (q1.size() == 0) {
                    res[i] = 0;
                }
                else {
                    res[i] = 0;
                }
            }
            
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }

    }
}