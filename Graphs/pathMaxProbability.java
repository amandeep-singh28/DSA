package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class pathMaxProbability {
    class Pair implements Comparable<Pair> {
        int node;
        double prob;
        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair p) {
            if (this.prob == p.prob) return this.node - p.node;
            return Double.compare(this.prob, p.prob);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double prob = succProb[i];
            adj.get(u).add(new Pair(v, prob));
            adj.get(v).add(new Pair(u, prob));
        }
        double[] ans = new double[n];
        ans[start] = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()); //maxHeap
        pq.add(new Pair(start, 1.0));
        while (pq.size() > 0) {
            Pair top = pq.remove();
            int node = top.node;
            if (top.prob > ans[node]) continue;
            for (Pair p : adj.get(node)) {
                double totalProb = top.prob * p.prob;
                if (totalProb > ans[p.node]) {
                    ans[p.node] = totalProb;
                    pq.add(new Pair(p.node, totalProb));
                }
            }
        }
        return ans[end];

    }
    public static void main(String[] args) {
        
    }
}
