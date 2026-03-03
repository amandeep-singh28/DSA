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
    static void twoPointer(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        // sort(arr);
        twoPointer(arr);
    }
}
