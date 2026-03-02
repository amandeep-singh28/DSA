public class secondLargest {
    static void largest(int[] arr) {
        int arr2[] = arr.clone();
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] == firstMax) arr2[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] > secondMax) {
                secondMax = arr2[i];
            }
        }
        System.out.println("First Largest Value:" + firstMax);
        System.out.println("Second Largest Value:" + secondMax);
    }
    public static void main(String[] args) {
        int arr[] = {9, 8, 9, 6, 9, 5, 8};
        largest(arr);
        for (int element : arr) System.out.print(element + " ");
    }
}
