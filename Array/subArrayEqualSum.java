public class subArrayEqualSum {
    static boolean booleanCheck(int[] arr) {
        int prefix[] = new int[arr.length];
        int suffix[] = new int[arr.length];
        prefix[0] = arr[0];
        suffix[arr.length - 1] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        for (int element : suffix) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : prefix) {
            System.out.print(element + " ");
        }

        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (prefix[i] == suffix[i + 1]) {
                idx = i;
            }
        }

        if (idx == 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 3, 1};
        int arr1[] = {15, 5, 6, 4, 8, 2};
        System.out.println(booleanCheck(arr));
        System.out.println(booleanCheck(arr1));
    }
}
