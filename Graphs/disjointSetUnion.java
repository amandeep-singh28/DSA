package Graphs;

public class disjointSetUnion {
    public static int find(int a, int[] parent) {
        if (parent[a] == a) return a;
        return find(parent[a], parent);
    }
    public static void union(int a, int b, int[] parent, int[] size) {
        int leaderA = find(a, parent);
        int leaderB = find(b, parent);
        if (leaderA != leaderB) {
            if (size[leaderA] > size[leaderB]) {
                parent[leaderB] = leaderA;
                size[leaderA] = size[leaderA] + size[leaderB];
            } else {
                parent[leaderA] = leaderB;
                size[leaderB] = size[leaderB] + size[leaderA];
            }
        }
    }
    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        int[] parent = new int[n + 1]; // 1 to n nodes
        int[] size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adj[i][j] == 1) {
                    union(i + 1, j + 1, parent, size);
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (parent[i] == i) {
                count++;
            }
        }
        return count;
    }
}
