package a763;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/22 9:03
 */
public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list=new LinkedList<>();
        int start=0,end=0,left=0;
        while (left<S.length()){
            int right=S.length()-1;
            char leftChar=S.charAt(left);
            while (left<=right){
                if(leftChar==S.charAt(right)){
                    break;
                }
                right--;
            }
            end=Math.max(end,right);
            if(left==end){
                list.add(end-start+1);
                start=end+1;
                end=0;
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.partitionLabels("ababcbacadefegdehijhklij");
    }
}
