public class prefixSum {
    static void calcSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; 
        }
        for (int element : arr) System.out.print(element + " ");
        System.out.println();
        for (int element : prefix) System.out.print(element + " ");
    }
    static void calcSum2(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        for (int element : arr) System.out.print(element + " ");

    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5};
        // calcSum(arr);
        calcSum2(arr);
    }
}
