public class reverseArray {
    static void reverse(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void whileReverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        // reverse(arr);
        whileReverse(arr);
    }
}
