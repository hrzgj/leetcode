package a839;

/**
 * @author: chenyu
 * @date: 2021/1/31 9:59
 */
public class Solution {
    public int numSimilarGroups(String[] strs) {
        Union union=new Union(strs.length);
        for(int i=0;i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                if(check(strs[i],strs[j])){
                    union.union(i,j);
                }
            }
        }
        return union.count;
    }

    private boolean check(String s1,String s2){
        int num=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                num++;
            }
            if(num>2){
                return false;
            }
        }
        return true;
    }

}
class Union {
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