package GraphsRevision;

import java.util.ArrayList;
import java.util.List;

public class edgeIntoAdjList {
    public static void main(String[] args) {
        // int n = 3;
        // int[][] edge = {
        //         { 0, 1 },
        //         { 1, 2 },
        //         { 2, 0 }
        // };

        int n = 6;
        int[][] edge = {
            {0, 1},
            {0, 2},
            {3, 5},
            {5, 4},
            {4, 3}
        };

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < edge.length; i++) {
            int u = edge[i][0], v = edge[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        System.out.println(list);
    }
}
