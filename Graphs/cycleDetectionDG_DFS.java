package Graphs;

import java.util.ArrayList;
import java.util.List;

public class cycleDetectionDG_DFS {
    static boolean ans;
    public void dfs(int i, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
        vis[i] = true;
        path[i] = true;

        for (Integer ele : adj.get(i)) {
            if (path[ele] == true) {
                ans = false; // Cycle is present
                return;
            }
            if (vis[ele] == false) {
                dfs(ele, adj, vis, path);
            }
        }
        path[i] = false; //After backtracking making node as false
    }
    public boolean canFinish(int n, int[][] edges) {
        ans = true;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1]; // b -> a 
            adj.get(b).add(a);
        }

        boolean vis[] = new boolean[n];
        boolean path[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) dfs(i, adj, vis, path);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
