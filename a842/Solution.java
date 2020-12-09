package a842;

import com.sun.glass.ui.Size;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/8 11:56
 */
public class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list=new LinkedList<>();
        if(S.length()<=2){
            return list;
        }
        back(S,list,0);
        return list;
    }

    private boolean back(String s,List<Integer> list,Integer index){
        if(index==s.length()&&list.size()>=3){
            return true;
        }
        for(int i=index;i<s.length();i++){
            if(s.charAt(index)=='0'&&i>index){
                break;
            }
            long num=getDigit(s,index,i+1);
            if(num>Integer.MAX_VALUE){
                break;
            }
            int size=list.size();
            if(size>=2&&num>list.get(size-1)+list.get(size-2)){
                break;
            }
            if(size<2||num==list.get(size-1)+list.get(size-2)){
                list.add((int) num);
                if(back(s,list,i+1)){
                    return true;
                }
                list.remove(size-1);

            }
        }
        return false;

    }

    private long getDigit(String s,int start,int end){
        long res=0;
        for(int i=start;i<end;i++){
            res=res*10+s.charAt(i)-'0';
        }
        return res;
    }
}
