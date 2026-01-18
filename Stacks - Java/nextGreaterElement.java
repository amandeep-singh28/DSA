import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] result = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] > arr[i]) {
        //             result[i] = arr[j];
        //             break;
        //         }
        //         result[j] = -1;
        //     }
        // }

        //  for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();

        // for (int i = 0; i < result.length; i++) {
        //     System.out.print(result[i] + " ");
        // }
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        result[n - 1] = -1;
        st.push(arr[n-1]);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0)
                result[i] = -1;
            else
                result[i] = st.peek();

            st.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
