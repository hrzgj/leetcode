package a71;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/12/3 11:31
 */
public class Solution {
    public String simplifyPath(String path) {
        String[] p=path.split("/");
        LinkedList<String> list=new LinkedList<>();
        for(String s:p){
            if(s.equals("..")){
                list.pop();
            }else if(!s.equals(".")&&!s.equals(" ")){
                list.push(s);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            sb.append("/").append(list.get(i));
        }
        return sb.length()==0 ? "/" : sb.toString();


    }
}
