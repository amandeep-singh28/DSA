public class rotateKArray {
    static void rotate(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j = j + 1;
        }
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j = j + 1;
        }
        System.out.println(j);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 15;
        rotate(arr, k);
    }
}
