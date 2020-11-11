package a514;

import com.sun.org.apache.bcel.internal.generic.DDIV;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/11 9:26
 */
public class Solution {

    public int findRotateSteps2(String ring, String key) {
        Map<Character,List<Integer>> mp;
        int[][] dp;
        int rl=ring.length();
        int kl=key.length();
        if(kl==0) return 0;
        char[] r=ring.toCharArray();
        char[] k=key.toCharArray();
        mp = new HashMap<>();
        for(int i=0;i<rl;i++){//保存字符出现的位置
            if(mp.containsKey(r[i])){
                mp.get(r[i]).add(i);
            }
            else{
                List<Integer> next= new ArrayList<>();
                next.add(i);
                mp.put(r[i],next);
            }
        }
        dp = new int[kl][rl];
        List<Integer> next2 = mp.get(k[0]);
        Iterator<Integer> it2 = next2.iterator();
        while(it2.hasNext()){
            int c = it2.next();
            int m = Math.min(c,rl-c);//找到每个位置
            dp[0][c]=m+1;
        }
        for(int i=1;i<kl;i++){

            List<Integer> next = mp.get(k[i]);
            Iterator<Integer> it = next.iterator();
            while(it.hasNext()){
                int c = it.next();//找到本次的所有位置
                int min=Integer.MAX_VALUE;
                List<Integer> next1 = mp.get(k[i-1]);
                Iterator<Integer> it1 = next1.iterator();
                while(it1.hasNext()){
                    int d = it1.next();//找到上个字符所有的位置来计算
                    int m = Math.min(rl-c+d,rl-d+c);
                    m = Math.min(m,Math.abs(c-d));
                    min=Math.min(min,dp[i-1][d]+m+1);

                }
                dp[i][c]=min;
            }
        }
        int ans=Integer.MAX_VALUE;
        List<Integer> next = mp.get(k[kl-1]);
        Iterator<Integer> it = next.iterator();
        while(it.hasNext()){
            ans=Math.min(ans,dp[kl-1][it.next()]);
        }
        return ans;


    }



    public int findRotateSteps(String ring, String key) {
        int[][] dp=new int[key.length()][ring.length()];
        if(key.length()==0){
            return 0;
        }
        Map<Character, List<Integer>> map=new HashMap<>();
        for(int i=0;i< ring.length();i++){
            char s=ring.charAt(i);
            if(map.containsKey(s)){
                map.get(s).add(i);
            }else {
                LinkedList<Integer> linkedList=new LinkedList<>();
                linkedList.add(i);
                map.put(s,linkedList);
            }
        }
        for (int i = 0; i < key.length(); ++i) {
            Arrays.fill(dp[i], 0x3f3f3f);
        }

        char one=key.charAt(0);
        List<Integer> linkedList=map.get(one);
        for(Integer integer:linkedList){
            dp[0][integer]=Math.min(integer,ring.length()-integer)+1;
        }
        for(int i=1;i<key.length();i++){
            char s=key.charAt(i);
            char before=key.charAt(i-1);
            List<Integer> list=map.get(s);
            for(Integer integer:list){
                int temp=Integer.MAX_VALUE;
                for(Integer index:map.get(before)){
                    int distance=index-integer;
                    int m=Math.min(Math.min(ring.length()-distance,ring.length()+distance),Math.abs(distance));
                    temp=Math.min(dp[i-1][index]+m+1,temp);
                }
                dp[i][integer]=temp;
            }
        }
        return Arrays.stream(dp[key.length() - 1]).min().getAsInt();
    }
}
