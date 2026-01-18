import java.util.Stack;

public class removeConsecuticeSub {
    public static int[] removeSub(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
            else if (st.peek() == arr[i]) {
                if (i == length - 1 || st.peek() != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int[] result = new int[st.size()];
        int m = result.length;
        for (int i = m - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int result[] = removeSub(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
