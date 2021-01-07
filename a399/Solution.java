package a399;

import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/6 20:17
 */
public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res=new double[queries.size()];
        double[] temp=new double[26];
        temp[equations.get(0).get(1).charAt(0)-'a']=1;
        temp[equations.get(0).get(0).charAt(0)-'a']=values[0];
        for(int i=1;i<equations.size();i++){
            List<String> list=equations.get(i);
            char a=list.get(0).charAt(0);
            char b=list.get(1).charAt(0);
            if(temp[a-'a']!=0){
                temp[b-'a']=temp[a-'a']/values[i];
            }else {
                temp[a-'a']=temp[b-'a']*values[i];
            }
        }
        int index=0;
        for(List<String> list:queries){
            char a=list.get(0).charAt(0);
            char b=list.get(1).charAt(0);
            if(temp[a-'a']!=0&&temp[b-'a']!=0){
                res[index++]=temp[a-'a']/temp[b-'a'];
            }else {
                res[index++]=-1.0;
            }

        }
        return res;
    }
}
