package Sorting;

public class selectionSort {
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, -2, 6, 7, 2, 0, 7, 2};
        int length = arr.length;
        print(arr);

        for (int i = 0; i < length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < length - 1; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            //Swapping
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        print(arr);
    }
}