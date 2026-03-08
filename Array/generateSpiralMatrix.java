public class generateSpiralMatrix {
    class Solution {
    public int[][] generateMatrix(int n) {
        int totalElements = n * n;
        int count = 1;
        
        int ans[][] = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;

        while (count <= totalElements) {
            // topRow = leftCol -> rightCol
            for (int j = leftCol; j <= rightCol && count <= totalElements; j++) {
                ans[topRow][j] = count;
                count++;
            }
            topRow++;
            // rightCol = topRow -> bottomRow
            for (int i = topRow; i <= bottomRow && count <= totalElements; i++) {
                ans[i][rightCol] = count;
                count++;
            }
            rightCol--;
            //bottomRow = rightCol -> leftCol
            for (int j = rightCol; j >= leftCol && count <= totalElements; j--) {
                ans[bottomRow][j] = count;
                count++;
            }
            bottomRow--;
            //leftCol = bottomRow -> topRow
            for (int i = bottomRow; i >= topRow && count <= totalElements; i--) {
                ans[i][leftCol] = count;
                count++;
            }
            leftCol++;
        }
        return ans;
    }
}
}
