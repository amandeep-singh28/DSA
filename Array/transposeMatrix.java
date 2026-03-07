public class transposeMatrix {
    static void transpose(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int ans[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        transpose(arr);
    }
}
