package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cycleDetection {
    class Pair {
        int node;
        int parent;
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
    
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            List<Integer> list2 = new ArrayList<>();
            list.add(list2);
        }
        
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0], b = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                // if (bfs(i, list, vis) == true) return true;
                if (dfs(i, -1, list, vis) == true) return true;
            }
        }
        return false;
    }
    public boolean dfs(int start, int parent, List<List<Integer>> list, boolean vis[]) {
        vis[start] = true;
        for (var child : list.get(start)) {
            if (vis[child] == false) {
                if (dfs(child, start, list, vis) == true) return true;
            } else if (vis[child] == true && child != parent) {
                return true;
            }
        }
        return false;
    }
    public boolean bfs(int start, List<List<Integer>> list, boolean vis[]) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, -1));
        vis[start] = true;
        while (q.size() > 0) {
            Pair remove = q.remove();
            for (var child : list.get(remove.node)) {
                if (vis[child] == false) {
                    vis[child] = true;
                    q.add(new Pair(child, remove.node));
                } else if (child != remove.parent){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        
    }
}
