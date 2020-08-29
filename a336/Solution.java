package a336;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/6 10:19
 */
public class Solution {
    //暴力破解
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list=new LinkedList<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append(words[i]);
                stringBuilder.append(words[j]);
                String a=stringBuilder.toString();
                if(stringBuilder.reverse().toString().equals(a)){
                    List<Integer> integerList=new LinkedList<>();
                    integerList.add(i);
                    integerList.add(j);
                    list.add(integerList);
                    if(words[i].length()==words[j].length()){
                        List<Integer> list1=new LinkedList<>();
                        list1.add(j);
                        list1.add(i);
                        list.add(list1);
                        continue;
                    }
                }
                StringBuilder builder=new StringBuilder();
                builder.append(words[j]);
                builder.append(words[i]);
                String b=builder.toString();
                if(builder.reverse().toString().equals(b)) {
                    List<Integer> integerList=new LinkedList<>();
                    integerList.add(j);
                    integerList.add(i);
                    list.add(integerList);
                }
            }
        }
        return list;
    }
}
