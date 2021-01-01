package a605;

import a1114.Foo;

/**
 * @author: chenyu
 * @date: 2021/1/1 9:36
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(flowerbed[0]==0&&n==1){
                return true;
            }
        }
        if(flowerbed.length>1&&flowerbed[0]==0&&flowerbed[1]==0){
            n--;
        }
        if(flowerbed.length>1&&flowerbed[flowerbed.length-2]==0&&flowerbed[flowerbed.length-1]==0){
            n--;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
                n--;
                flowerbed[i]=1;
            }
        }
        return n==0;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.canPlaceFlowers(new int[]{0,0,1,0,0,1},1);
    }
}
