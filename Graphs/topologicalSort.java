package Graphs;

import java.util.*;

class TopologicalSort {

    static ArrayList<Integer> ans = new ArrayList<>();

    // DFS function
    static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;

        for (int ele : adj.get(node)) {
            if (!vis[ele]) {
                dfs(ele, vis, adj);
            }
        }

        // add after visiting all neighbors
        ans.add(node);
    }

    // Topological sort function
    static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, vis, adj);
            }
        }

        // reverse because nodes were added post-DFS
        Collections.reverse(ans);
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = topoSort(V, adj);

        System.out.println("Topological Order:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
