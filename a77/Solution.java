package a77;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/8 10:23
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    int n;
    int k;
    boolean[] booleans;

    public List<List<Integer>> combine(int n, int k) {
        booleans=new boolean[n];
        this.n=n;
        this.k=k;
        back(new LinkedList<>(),1);
        return lists;
    }

    private void back(List<Integer> list,int j){
        if(list.size()+n-j+1<k){
            return;
        }
        if(list.size()==k){
            lists.add(new LinkedList<>(list));
            return;
        }
        for(int i=j;i<=n;i++){
            if(booleans[i-1]){
                continue;
            }
            booleans[i-1]=true;
            list.add(i);
            back(list,i+1);
            booleans[i-1]=false;
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine2(int n, int k) {
        this.n=n;
        this.k=k;
        booleans=new boolean[n+1];
        back2(0,new LinkedList<>(),0);
        return lists;
    }

    private void back2(int size,List<Integer> list,int j){
        if(size==k){
            lists.add(new LinkedList<>(list));
            return;
        }
        for(int i=j;i<=n;i++){
            if(booleans[i]){
                continue;
            }else {
                list.add(i);
                booleans[i]=true;
                back2(size + 1, list,i+1);
                list.remove(list.size() - 1);
                booleans[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.combine(4,2);
    }
}
