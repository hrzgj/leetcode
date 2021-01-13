/**
 * @author: chenyu
 * @date: 2021/1/12 10:44
 */
public class Union {
    int[] parent;
    int count;
    int[] size;

    public Union (int n){
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
        while (parent[x]!=x){
            parent[x]=parent[parent[x]];
            x=parent[x];
        }
        return x;
    }
}
