public class arraySortedOrNot {
    static boolean check(int[] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = check(arr);
        if (result == true) System.out.println("Array Sorted");
        else System.out.println("Array not sorted");
    }
}
