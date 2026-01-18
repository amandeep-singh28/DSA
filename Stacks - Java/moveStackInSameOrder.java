import java.util.Scanner;
import java.util.Stack;
// Time Complexity -> O(n) (Reverse) -> O(2n) (Normal) => O(n) 
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        // System.out.println("Enter number of elements:");
        // int n = sc.nextInt();
        // System.out.println("Enter Elements:");
        // for (int i = 0; i < n; i++) {
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0) {
            gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);
        System.out.println(st); // Earlier stacks will be empty because of the pop() operation
        System.out.println(gt);
        sc.close();
    }
}
