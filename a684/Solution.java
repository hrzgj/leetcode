package a684;

/**
 * @author: chenyu
 * @date: 2021/1/13 10:29
 */
public class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Union union=new Union(edges.length);
        for(int[] edge:edges){
            if(union.check(edge[0],edge[1])){
                return edge;
            }
            union.union(edge[0],edge[1]);
        }
        return new int[]{0,0};
    }

    class Union{
        int[] parent;
        int[] size;
        int count;

        public Union(int n){
            count=n;
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }

        public void union(int x,int y){
            int rootX=find(x);
            int rootY=find(y);
            if(rootX==rootY){
                return;
            }
            if(size[rootX]>size[rootY]){
                parent[rootY]=rootX;
                size[rootX]+=size[rootY];
            }else {
                parent[rootX]=rootY;
                size[rootY]+=size[rootX];
            }
            count--;
        }

        private int find(int x){
            while (x!=parent[x]){
                parent[x]=parent[parent[x]];
                x=parent[x];
            }
            return x;
        }

        private boolean check(int x,int y){
            return find(x)==find(y);
        }
    }
}
