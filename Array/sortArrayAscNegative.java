public class sortArrayAscNegative {
    static void sortAsc(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans[] = new int[arr.length];
        int idx = arr.length - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[idx--] = arr[left] * arr[left];
                left++;
            } else {
                ans[idx--] = arr[right] * arr[right];
                right--;
            }
        }
        for (int element : ans) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {-10, -3, -2, 1, 4, 5};
        int arr1[] = {-7, -3, 2, 3, 11};
        // sortAsc(arr);
        sortAsc(arr1);
    }
}
