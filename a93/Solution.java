package a93;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/9 10:27
 */
public class Solution {
    List<String> list=new LinkedList<>();
    int[] n;
    public List<String> restoreIpAddresses(String s) {
        n=new int[4];
        back(s,0,0);
        return list;
    }

    private void back(String s,int ip,int start){
        if(ip==4){
            if(s.length()==start) {
                StringBuffer ipAddr = new StringBuffer();
                for (int i = 0; i < 4; ++i) {
                    ipAddr.append(n[i]);
                    if (i != 3) {
                        ipAddr.append('.');
                    }
                }
                list.add(ipAddr.toString());
            }
            return;
        }
        if(s.length()==start){
            return;
        }
        if (s.charAt(start) == '0') {
            n[ip]=0;
            back(s,ip+1,start+1);
        }
        int result=0;
        for(int i=start;i<s.length();i++){
            result=result*10+(s.charAt(i)-'0');
            if(result>0&&result<255){
                n[ip]=result;
                back(s,ip+1,i+1);
            }
            else{
                break;
            }
        }
    }
}
