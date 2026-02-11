package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// In kahn's algorithm there is no need for visited array

public class cycleDetectionDG {
    public boolean canFinish(int n, int[][] edges) {
        int indegree[] = new int[n];
        // boolean vis[] = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1]; // b -> a
            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
                // vis[i] = true;
            }
        }
        while (q.size() > 0) {
            int front = q.remove();
            ans.add(front);
            for (int element : adj.get(front)) {
                indegree[element]--;
                if (indegree[element] == 0) {
                    q.add(element);
                    // vis[element] = true;
                }
            }
        }
        if (ans.size() == n)
            return true;
        else
            return false;

    }
}
