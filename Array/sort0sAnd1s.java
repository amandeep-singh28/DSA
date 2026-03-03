public class sort0sAnd1s {
    static void sort(int arr[]) {
        int count = 0;
        int len = arr.length;
        for (int element : arr) {
            if (element == 0) count++;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < len; i++) {
            arr[i] = 1;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        sort(arr);
    }
}
