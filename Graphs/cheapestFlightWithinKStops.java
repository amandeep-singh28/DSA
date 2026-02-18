package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class cheapestFlightWithinKStops {
    class Pair {
        int node;
        int cost;
        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    class Triplet implements Comparable<Triplet>{
        int node;
        int cost;
        int stops;
        Triplet(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
        public int compareTo(Triplet p) {
            if (this.stops == p.stops) return Integer.compare(this.cost, p.cost);
            return Integer.compare(this.stops, p.stops);
        }
    }


    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0], to = flights[i][1], cost = flights[i][2];
            adj.get(from).add(new Pair(to, cost));
        }
        
        int ans[] = new int[n - 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;

        // PriorityQueue<Triplet> pq = new PriorityQueue<>();
        Queue<Triplet> pq = new ArrayDeque<>();
        pq.add(new Triplet(src, 0, 0));

        while (pq.size() > 0) {
            Triplet top = pq.remove();
            int node = top.node, cost = top.cost, stops = top.cost;
            if (stops == k - 1) continue;
            for (Pair p : adj.get(node)) {
                int totalCost = cost + p.cost;
                if (totalCost < ans[p.node]) {
                    ans[p.node] = totalCost;
                    pq.add(new Triplet(p.node, totalCost, stops + 1));
                }
            }
        }
        if (ans[dst] == Integer.MAX_VALUE) return -1;
        return ans[dst];

    }
    public static void main(String[] args) {
        
    }
}
