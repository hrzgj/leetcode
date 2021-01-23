package a1319;

/**
 * @author: chenyu
 * @date: 2021/1/23 9:47
 */
public class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        Union union = new Union(n);
        int res=0;
        for(int[] connection:connections){
            if(union.union(connection[0],connection[1])){
                res++;
            }
        }
        int count=union.count;
        return res;
    }

    public class Union {
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

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return true;
            }
            if (size[rootX] > size[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            } else {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            }
            count--;
            return false;
        }

        private int find(int x){
            while (parent[x]!=x){
                parent[x]=parent[parent[x]];
                x=parent[x];
            }
            return x;
        }
    }
}
