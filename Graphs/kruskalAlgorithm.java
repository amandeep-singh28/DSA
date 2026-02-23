package Graphs;

import java.util.PriorityQueue;

public class kruskalAlgorithm {
    class Triplet implements Comparable<Triplet> {
        int u;
        int v;
        int dist;
        Triplet(int u, int v, int dist) {
            this.u = u;
            this.v = v;
            this.dist = dist;
        }
        public int compareTo(Triplet t) {
            if (this.dist == t.dist) return Integer.compare(this.u, t.u);
            return Integer.compare(this.dist, t.dist);
        }
    }

    public int find(int a, int[] parent) {
        if (parent[a] == a) return a;
        int leader = find(parent[a], parent);
        parent[a] = leader;
        return leader;
    }
    public void union(int a, int b, int[] parent, int[] size) {
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

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] parent = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];
                int mDis = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                pq.add(new Triplet(i, j, mDis));
            }
        }
        int ans = 0;
        while(pq.size() > 0) {
            Triplet top = pq.remove();
            int u = top.u, v = top.v, dist = top.dist;
            if (find(u, parent) != find(v, parent)) {
                ans += dist;
                union(u, v, parent, size);
            }
        }
        return ans;

    }
}
