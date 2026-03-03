public class mergeTwoArray {
    static void merge(int arr1[], int arr2[]) {
        int[] ans = new int[arr1.length + arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i];
                i++;
            } else if (arr2[j] <= arr1[i]) {
                ans[k++] = arr2[j];
                j++;
            }
        }
        while (j < len2) {
            ans[k++] = arr2[j];
            j++;
        }
        while (i < len1) {
            ans[k++] = arr1[i];
            i++;
        }
        for (int element : ans) {
            System.out.print(element + " ");
        }
        
        float median;
        int ansLen = ans.length;
        if (ansLen % 2 == 0) {
            int mid = ansLen / 2;
            median = (float)(ans[mid - 1] + ans[mid]) / 2;
        } else {
            median = ans[ansLen / 2];
        }
        System.out.println("Median:" + median);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2);
    }
}