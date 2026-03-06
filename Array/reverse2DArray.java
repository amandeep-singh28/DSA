public class reverse2DArray {
    static void printArray(int rows, int cols, int arr[][]) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int rows, int cols, int arr[][]) {
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }  
        }
        System.out.println("Reversed 2D array:");
        printArray(rows, cols, arr);
    }
    
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int arr[][] = {
            {1, 2, 3, 10},
            {4, 5, 6, 11},
            {7, 8, 9, 12}
        };

        System.out.println("Matrix 1:");
        printArray(rows, cols, arr);

        reverse(rows, cols, arr);
    }
}
