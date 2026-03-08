public class spiralMatrix {
    public static void main(String[] args) {
        // int arr[][] = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int r = arr.length;
        int c = arr[0].length;

        int topRow = 0, bottomRow = r - 1, rightCol = c - 1, leftCol = 0;

        int totalElements = 0;
        
        while(totalElements < r * c) {
            // topRow -> leftCol - rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            
            // rightCol -> topRow - bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol - leftCol
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow - topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

        }
    }
}
