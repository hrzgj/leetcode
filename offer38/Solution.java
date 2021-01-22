package offer38;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/22 9:39
 */
public class Solution {
    List<String> list=new LinkedList<>();
    boolean[] visit;
    public String[] permutation(String s) {
        char[] c=s.toCharArray();
        visit=new boolean[c.length];
        Arrays.sort(c);
        back(c,new StringBuilder());
        String[] res=new String[list.size()];
        int index=0;
        for(String s1:list){
            res[index++]=s1;
        }
        return res;
    }

    private void back(char[] c,StringBuilder stringBuilder){
        if(stringBuilder.length()==c.length){
            list.add(stringBuilder.toString());
            return;
        }
        for(int j=0;j<c.length;j++){
            if(j>0&&c[j]==c[j-1]&&visit[j-1]){
                continue;
            }
            if(visit[j]){
                continue;
            }
            stringBuilder.append(c[j]);
            visit[j]=true;
            back(c,stringBuilder);
            visit[j]=false;
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
