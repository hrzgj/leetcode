package a91;

/**
 * @author: chenyu
 * @date: 2021/4/21 9:04
 */
public class Solution {
    int res=0;
    public int numDecodings(String s) {
        char[] cs=s.toCharArray();
        back(cs,0);
        return res;
    }

    private void back(char[] cs,int index){
        if(index==cs.length){
            res++;
            return;
        }
        int num=0;
        for (int i = index; i < cs.length; i++) {
            num*=10;
            num+=cs[i]-'0';
            if(num>=1 && num<=26){
                back(cs,i+1);
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.numDecodings("226");
    }
}
