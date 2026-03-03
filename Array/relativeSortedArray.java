import java.util.Arrays;

public class relativeSortedArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        int idx = 0;

        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                if (arr2[i] == arr1[j]) {
                    ans[idx++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }

        Arrays.sort(arr1);
        for (int element : arr1) {
            if (element >= 0) ans[idx++] = element;
        }
        return ans;
    }
}
