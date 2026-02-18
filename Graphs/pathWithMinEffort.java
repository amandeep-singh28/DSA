package Graphs;

import java.util.PriorityQueue;

public class pathWithMinEffort {
    class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;
        Triplet (int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        public int compareTo(Triplet p) {
            if (this.effort == p.effort) return Integer.compare(this.row, p.row);
            return Integer.compare(this.effort, p.effort);
        }
    }
    public int minimumEffortPath(int[][] arr) {
        int m = arr.length; // row length
        int n = arr[0].length; // col length

        int ans[][] = new int[m][n];
        // Populate this array with Integer.MAX_VALUE
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Integer.MAX_VALUE;
            }
        }

        int r[] = {-1, 0, 1, 0};
        int c[] = {0, -1, 0, 1};

        ans[0][0] = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, 0, 0));
        
        while (pq.size() > 0) {
            Triplet top = pq.remove();
            int row = top.row;
            int col = top.col;
            int effort = top.effort;

            for (int i = 0; i <= 3; i++) {
                int newRow = row + r[i];
                int newCol = col + c[i];
                if (newRow < 0 || newCol < 0 || newRow > m - 1 || newCol > n - 1) continue;
                int e = Math.abs(arr[row][col] - arr[newRow][newCol]);
                e = Math.max(e, effort);
                if (e < ans[newRow][newCol]) {
                    ans[newRow][newCol] = e;
                    pq.add(new Triplet(newRow, newCol, e));
                }
            }
        }

        while (pq.size() > 0) {
            Triplet top = pq.remove();
            int row = top.row;
            int col = top.col;
            int effort = top.effort;
            // if (row == m - 1 && col == n - 1) break;
            if (row > 0) { // Top
                int e = Math.abs(arr[row][col] - arr[row - 1][col]);
                e = Math.max(e, effort);
                if (e < ans[row - 1][col]) {
                    ans[row - 1][col] = e;
                    pq.add(new Triplet(row - 1, col, e));
                }
            }
            if (row < m - 1) { // Bottom
                int e = Math.abs(arr[row][col] - arr[row + 1][col]);
                e = Math.max(e, effort);
                if (e < ans[row + 1][col]) {
                    ans[row + 1][col] = e;
                    pq.add(new Triplet(row + 1, col, e));
                }
            }
            if (col > 0) { // Left
                int e = Math.abs(arr[row][col] - arr[row][col - 1]);
                e = Math.max(e, effort);
                if (e < ans[row][col - 1]) {
                    ans[row][col - 1] = e;
                    pq.add(new Triplet(row, col - 1, e));
                }
            }
            if (col < n - 1) { // Right
                int e = Math.abs(arr[row][col] - arr[row][col + 1]);
                e = Math.max(e, effort);
                if (e < ans[row][col + 1]) {
                    ans[row][col + 1] = e;
                    pq.add(new Triplet(row, col + 1, e));
                }
            }
        }
        return ans[m - 1][n - 1];
    }
    public static void main(String[] args) {
        
    }
}
