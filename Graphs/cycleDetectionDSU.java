package Graphs;

public class cycleDetectionDSU {
    public int find(int a, int[] parent) {
        if (parent[a] == a) return a;
        return find(parent[a], parent);
    }
    public void union(int a, int b, int[] parent) {
        int leaderA = find(a, parent);
        int leaderB = find(b, parent);
        if (leaderA != leaderB) {
            parent[leaderA] = parent[leaderB];
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        int ans[] = new int[2];
        int parent[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            if (find(u, parent) == find(v, parent)) {
                ans[0] = u;
                ans[1] = v;
                break;
            } else {
                union(u, v, parent);
            }
        }
        return ans;
    }
}
