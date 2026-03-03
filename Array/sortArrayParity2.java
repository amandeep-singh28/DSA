public class sortArrayParity2 {
    public int[] sortArrayByParityII(int[] arr) {
        int n = arr.length;
        int even = 0;
        int odd = 1;
        while (even < n && odd < n) {
            if (arr[even] % 2 == 0) even += 2;
            else if (arr[odd] % 2 == 1) odd += 2;
            else {
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }
        }
        return arr;
    }
}
