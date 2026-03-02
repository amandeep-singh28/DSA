public class arrayReference {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Copied Array:");
        int[] arr2 = arr;
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;
        System.out.println("Original array after changing:");
        printArray(arr);
        System.out.println("Copied array after changing:");
        printArray(arr2);
    }
}