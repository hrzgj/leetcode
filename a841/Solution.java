package a841;

import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/31 10:18
 */
public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] booleans=new boolean[rooms.size()];
        dfs(rooms,booleans,0);
        for(boolean b:booleans){
            if(!b){
                return false;
            }
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms,boolean[] booleans,int i){
        if(booleans[i]){
            return;
        }
        booleans[i]=true;
        List<Integer> keys=rooms.get(i);
        for(Integer key:keys){
            dfs(rooms,booleans,key);
        }
    }
}
