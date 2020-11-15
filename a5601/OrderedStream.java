package a5601;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/15 10:31
 */
public class OrderedStream {
    String[] result;
    int ptr=1;
    public OrderedStream(int n) {
         result=new String[n+1];
        Arrays.fill(result,null);
    }

    public List<String> insert(int id, String value) {
        List<String> list=new LinkedList<>();
        if(id==ptr){
            result[id]=value;
            for(int i=id;i<result.length;i++){
                if(result[i]!=null){
                    list.add(result[i]);
                }else {
                    ptr=i;
                    return list;
                }
            }
        }else {
            result[id]=value;
            return list;
        }
        return list;
    }
}
