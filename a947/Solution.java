package a947;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author: chenyu
 * @date: 2021/1/15 9:47
 */
public class Solution {
    public int removeStones(int[][] stones) {

        Union union = new Union(stones.length);

        for (int i = 0; i < stones.length; i++) {
            int x = stones[i][0], y = stones[i][1];
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[j][0] == x || stones[j][1] == y) {
                    union.union(i, j);
                }
            }
        }
        return stones.length - union.count;

    }

    class Union {
        int[] parent;
        int count;
        int[] size;

        public Union(int n) {
            count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (size[rootX] > size[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            } else {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            }
            count--;
        }

        private int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
    }
}
