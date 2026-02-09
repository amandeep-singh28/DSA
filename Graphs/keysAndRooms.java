package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class keysAndRooms {
    class Solution {
        public void bfs(int start, List<List<Integer>> adj, boolean[] visited) {
            Queue<Integer> q1 = new LinkedList<>();
            q1.add(start);

            while (q1.size() > 0) {
                int remove = q1.remove();
                for (Integer element : adj.get(remove)) {
                    if (visited[element] == false) {
                        q1.add(element);
                        visited[element] = true;
                    }
                }
            }
        }

        public void dfs(int start, List<List<Integer>> adj, boolean[] visited) {
        visited[start] = true;
        for (var element : adj.get(start)) {
            if (visited[element] == false) {
                dfs(element, adj, visited);
            }
        }
    }

        public boolean canVisitAllRooms(List<List<Integer>> adj) {
            int n = adj.size();
            boolean[] visited = new boolean[n];
            visited[0] = true;
            // bfs(0, adj, visited);
            dfs(0, adj, visited);
            for (var element : visited) {
                if (element == false)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
