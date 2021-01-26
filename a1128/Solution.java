package a1128;

/**
 * @author: chenyu
 * @date: 2021/1/26 9:23
 */
public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num=new int[100];
        int res=0;
        for(int[] domino:dominoes){
            int x=domino[0],y=domino[1];
            if(x>y){
                int temp=x;
                x=y;
                y=temp;
            }
            int index=x*10+y;
            res+=num[index];
            num[index]++;
        }

        return res;
    }

    class Union{
        int[] parent;
        int[] size;
        int count;
        public Union(int n){
            parent=new int[n];
            size=new int[n];
            count=n;
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }

        private int find(int x){
            while (parent[x]!=x){
                parent[x]=parent[parent[x]];
                x=parent[x];
            }
            return x;
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

    }
}
