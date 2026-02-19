// Network Delay Time(LeetCode)
package Graphs;

import java.util.Arrays;

public class bellmanFordAlgo {
    public int networkDelayTime(int[][] times, int n, int src) {
        int[] ans = new int[n + 1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;

        for (int i = 1; i <= n; i++) { // n - 1 edges travel
            for (int j = 0; j < times.length; j++) { // All edges relaxed
                int u = times[j][0];
                int v = times[j][1];
                int wt = times[j][2];
                if (ans[u] != Integer.MAX_VALUE && ans[u] + wt < ans[v]) {
                    ans[v] = ans[u] + wt;
                }

            }
        }

        // nth time relaxation for -ve detection
        for (int j = 0; j < times.length; j++) { // All edges relaxed
                int u = times[j][0];
                int v = times[j][1];
                int wt = times[j][2];
                if (ans[u] != Integer.MAX_VALUE && ans[u] + wt < ans[v]) {
                    return -1; // Indication -ve cycle
                }

            }

        int max = -1;
        for (int i = 1; i <= n; i++) {
            if (ans[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}
