package a135;

/**
 * @author: chenyu
 * @date: 2020/12/24 9:57
 */
public class Solution {
    public int candy(int[] ratings) {
        int res=ratings.length;
        int[] temp=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            if(i<ratings.length-1&&ratings[i]>ratings[i+1]&&temp[i]<=temp[i+1]){
                res-=temp[i];
                temp[i]=temp[i+1]+1;
                res+=temp[i];
            }
            if(i>0&&ratings[i]>ratings[i-1]&&temp[i]<=temp[i-1]){
                res-=temp[i];
                temp[i]=temp[i-1]+1;
                res+=temp[i];
            }
        }
        for(int i=ratings.length;i>=0;i--){
            if(i<ratings.length-1&&ratings[i]>ratings[i+1]&&temp[i]<=temp[i+1]){
                res-=temp[i];
                temp[i]=temp[i+1]+1;
                res+=temp[i];
            }
            if(i>0&&ratings[i]>ratings[i-1]&&temp[i]<=temp[i-1]){
                res-=temp[i];
                temp[i]=temp[i-1]+1;
                res+=temp[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.candy(new int[]{1,2,87,87,87,2,1});
    }
}
