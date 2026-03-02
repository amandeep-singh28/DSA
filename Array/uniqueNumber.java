public class uniqueNumber {
    static void unique(int[] arr) {
        int arr2[] = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr2[i] = -1;
                    arr2[j] = -1;
                } 
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0) System.out.println("Unique Element:" + arr2[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 1, 3};
        unique(arr);
    }
}
