package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfProvinces {
    public static int findCircleNum(int[][] adj) {
        int count = 0;
        int n = adj.length;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                bfs(i, adj, visited);
                // dfs(i, adj, visited);
                count++;
            }
        }
        return count;
    }
    private static void bfs(int i, int[][] adj, boolean[] visited) {
        int n = adj.length;
        visited[i] = true;
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(i);

        while (q1.size() > 0) {
            int remove = q1.remove();
            for (int j = 0; j < n; j++) {
                if (adj[remove][j] == 1 && visited[j] == false) {
                    q1.add(j);
                    visited[j] = true;
                }
            }
        }
    }
    private static void dfs(int i, int[][] adj, boolean[] visited) {
        int n = adj.length;
        visited[i] = true;
        for (int j = 0; j < n; j++) {
                if (adj[i][j] == 1 && visited[j] == false) {
                    dfs(j, adj, visited);
                }

        }
    }
    public static void main(String[] args) {
        int[][] adj = {{1,1,0}, {1,1,0},{0,0,1}};

        System.out.println(findCircleNum(adj));
    }
}
