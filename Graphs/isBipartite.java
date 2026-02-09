package Graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class isBipartite {
    static boolean ans;
    public void bfs(int start, int[][] list, int[] vis) {
        Queue<Integer> q = new ArrayDeque<>();
        vis[start] = 0; // 1 red, 0 meanss blue
        q.add(start);
        while (q.size() > 0) {
            int remove = q.remove();
            int color = vis[remove];
            for (int element : list[remove]) {
                if (vis[element] == vis[remove]) {
                    ans = false;
                    return;
                }
                if (vis[element] == -1) {
                    vis[element] = 1 - color;
                    q.add(element);
                }
            }
        
        }
    }
    public boolean isBipartite(int[][] graph) {
        ans = true;
        int n = graph.length;
        int vis[] = new int[n]; //By default 0 will be stored
        Arrays.fill(vis, -1);
        for (int i = 0; i < n; i++) {
            if (vis[i] == -1) bfs(i, graph, vis);
            if (ans == false) return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
