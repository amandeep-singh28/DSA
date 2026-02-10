package Graphs;

import java.util.*;

class TopologicalSortBFS {

    static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];

        // calculate indegree
        for (int i = 0; i < V; i++) {
            for (int ele : adj.get(i)) {
                indegree[ele]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();

        // push all nodes with indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // BFS
        while (!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);

            for (int ele : adj.get(node)) {
                indegree[ele]--;
                if (indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        return ans;
    }
}
