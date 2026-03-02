public class firstValueRepeat {
    static void find(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    System.out.println("First value repeated:" + ans);
                    return;
                }
            }
        }
        System.out.println("Unique elements are there"); 
    }
    public static void main(String[] args) {
        // int arr[] = {1, 5, 3, 4, 6, 3, 4};
        int arr[] = {1, 2, 3};
        find(arr);
    }
}
