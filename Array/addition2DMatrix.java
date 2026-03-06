import java.util.Scanner;


public class addition2DMatrix {
    static void inputArray(int rows, int cols, int arr[][], Scanner sc) {
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    } 
    static void printArray(int rows, int cols, int arr[][]) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void additionMatrix(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Dimensions are not equal");
            return;
        }
        int ans[][] = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of matrix:");
        printArray(r1, c1, ans);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols for matrix 1:");
        int rows1 = sc.nextInt(), cols1 = sc.nextInt();
        int arr1[][] = new int[rows1][cols1];
        inputArray(rows1, cols1, arr1, sc);

        System.out.println("Enter number of rows and cols for matrix 1:");
        int rows2 = sc.nextInt(), cols2 = sc.nextInt();
        int arr2[][] = new int[rows2][cols2];
        inputArray(rows2, cols2, arr2, sc);

        System.out.println("Matrix 1:");
        printArray(rows1, cols1, arr1);
        System.out.println("Matrix 2:");
        printArray(rows2, cols2, arr2);

        additionMatrix(arr1, rows1, cols1, arr2, rows2, cols2);
        sc.close();

        
        
        
        
    }
}
