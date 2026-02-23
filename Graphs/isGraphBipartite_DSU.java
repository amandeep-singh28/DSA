package Graphs;

public class isGraphBipartite_DSU {
    public static int find(int a, int[] parent) {
        if (parent[a] == a) return a;
        int leader = find(parent[a], parent);
        parent[a] = leader;
        return leader;
    }
    public static void union(int a, int b, int[] parent, int[] size, boolean[] parity) {
        int leaderA = find(a, parent);
        int leaderB = find(b, parent);
        if (leaderA != leaderB) {
            if (size[leaderA] > size[leaderB]) {
                parent[leaderB] = leaderA;
                size[leaderA] = size[leaderA] + size[leaderB];
                parity[b] = !parity[a];
            } else {
                parent[leaderA] = leaderB;
                size[leaderB] = size[leaderB] + size[leaderA];
                parity[a] = !parity[b];
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int parent[] = new int[n];
        int size[] = new int[n];
        boolean parity[] = new boolean[n]; // By default false
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                int u = i, v = graph[i][j];
                if (v > u) {
                    if (find(u, parent) == find(u, parent)) {
                        if (parity[u] == parity[v]) return false;
                    } else {
                        union(u, v, parent, size, parity);
                    }
                }
            }
        }
        return true;

    }

}
