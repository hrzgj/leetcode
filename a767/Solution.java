package a767;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2020/11/30 9:17
 */
public class Solution {
    public String reorganizeString(String S) {
        int[] c=new int[26];
        PriorityQueue<Character> queue=new PriorityQueue<>((o1, o2) -> c[o2-'a']-c[o1-'a']);
        int length=S.length();
        int maxLength=-1;
        for(char a:S.toCharArray()){
            c[a-'a']++;
            maxLength=Math.max(maxLength,c[a-'a']);
        }
        if(maxLength>(length+1)/2){
            return "";
        }
        for(int i=0;i<26;i++){
            if(c[i]>0){
                queue.add((char)(i+'a'));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (queue.size()>1){
            Character one=queue.poll();
            Character two=queue.poll();
            stringBuilder.append(one).append(two);
            c[one-'a']--;
            c[two-'a']--;
            if(c[one-'a']>0){
                queue.add(one);
            }
            if(c[two-'a']>0){
                queue.add(two);
            }
        }
        if(queue.size()>0){
            stringBuilder.append(queue.peek());
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.reorganizeString("aab");
    }
}
