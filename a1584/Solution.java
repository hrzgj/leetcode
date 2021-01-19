package a1584;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/1/19 9:52
 */
public class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        List<Edge> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int len=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                list.add(new Edge(len,i,j));
            }
        }
        Collections.sort(list, (o1, o2) -> o1.len-o2.len);
        int res=0,num=1;
        Union union=new Union(n);
        for(Edge edge:list){
            int len=edge.len;
            if(union.union(edge.x,edge.y)){
                res+=len;
                num++;
            }
            if(num==n){
                break;
            }
        }
        return res;
    }

    class Edge {
        int len, x, y;

        public Edge(int len, int x, int y) {
            this.len = len;
            this.x = x;
            this.y = y;
        }
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

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return false;
            }
            if (size[rootX] > size[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            } else {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            }
            count--;
            return true;
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
