package a649;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/12/11 10:19
 */
public class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        LinkedList<Integer> dire=new LinkedList<>();
        LinkedList<Integer> radiant=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                radiant.offer(i);
            }else {
                dire.offer(i);
            }
        }
        while (!dire.isEmpty()&&!radiant.isEmpty()){
            int rIndex=radiant.pop();
            int dIndex=dire.pop();
            if(rIndex>dIndex){
                radiant.offer(rIndex+n);
            }else {
                dire.offer(dIndex+n);
            }
        }
        return radiant.isEmpty()?"Radiant":"Dire";
    }
}
