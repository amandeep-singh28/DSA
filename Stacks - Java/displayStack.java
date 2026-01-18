import java.util.Stack;

public class displayStack {
    public static void passRef(Stack<Integer> gt) {
        gt.push(6);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //System.out.println(st);

        // Without the help of the sout(), print the stack.
        // We can use STACK or ARRAY for this.
        // Steps:- Create Another Stack, Add element into another Stack, Pop out the element from the second stack to original stack + Print the elements while popping out.

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0) {
            gt.push(st.pop());
        }
       
        while(gt.size() > 0) {
            int x = gt.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        // 1 2 3 4 5
        // POP -> 5 4 3 2 1
        // Array -> 1 2 3 4 5
        // Array POP -> Zero Indexing se start ho 1 2 3 4 5

        // System.out.println(st);

        // int n = st.size();
        // int arr[] = new int[n]; // Don't use st.size(), because size will decrease from st.pop(), here n will be behave as a constant type
        // for (int i = n - 1; i >= 0; i--) {
        //     arr[i] = st.pop();;
        // }

        // for (int i = 0; i <= n - 1; i++) {
        //     System.out.print(arr[i] + " ");
        //     st.push(arr[i]);
        // }
        // System.out.println();
        // System.out.println(st);

        // System.out.println(st);
        // passRef(st);
        // System.out.println(st);


    }
}
