public class passByValue {
    static void changeVal(int a) {
        a = 10;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        changeVal(a); // but no change in case of variable
        System.out.println(a);

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("Original Array before pass by value:");
        printArray(arr);
        System.out.println("Original Array after pass by value:");
        changeArray(arr);
        printArray(arr);

    }
}
