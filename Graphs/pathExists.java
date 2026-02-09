package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class pathExists {
    public void bfs(int start, List<List<Integer>> list, boolean[] visited, int end) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(start);
        while (q1.size() > 0) {
            int remove = q1.remove();
            for (var element : list.get(remove)) {
                if (visited[element] == false) {
                    visited[element] = true;
                    q1.add(element);
                    if (element == end) return;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) return true;
        boolean visited[] = new boolean[n];
        visited[start] = true;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list2 = new ArrayList<>();
            list.add(list2);
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        bfs(start, list, visited, end);
        return visited[end];
    }
    public static void main(String[] args) {
        
    }
}
