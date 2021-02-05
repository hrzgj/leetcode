package a1208;

/**
 * @author: chenyu
 * @date: 2021/2/5 9:49
 */
public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        int res=0;
        int left=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            temp+=Math.abs(sc[i]-tc[i]);
            while (maxCost<temp){
                temp-=Math.abs(sc[left]-tc[left]);
                left++;
            }
            res=Math.max(res,i-left+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.equalSubstring("abcd","bcde",3);
    }
}
