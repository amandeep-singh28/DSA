package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class notElementsCycle {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        int indegree[] = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        //Now, we have to reverse the graph
        for (int i = 0; i < n; i++) {
            for (int element : graph[i]) {
                // Original i -> Element
                // Reverse Element -> i
                adj.get(element).add(i);
                indegree[i]++;
            }
        }

        //Applying kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (q.size() > 0) {
            int front = q.remove();
            ans.add(front);
            for (int element : adj.get(front)) {
                indegree[element]--;
                if (indegree[element] == 0) {
                    q.add(element);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
