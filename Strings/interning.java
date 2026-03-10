package Strings;

public class interning {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(s);
        System.out.println(x);

        int arr[] = {1, 2, 3};
        int arr1[] = arr;

        arr1[0] = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
