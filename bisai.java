import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2021/4/5 15:06
 */
public class bisai {
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int left=0,right=nums.length-1;
        while (left<right){
            int num=nums[left]+nums[right];
            if(target<=num){
                res=(res+right-left)%1000000007;
                left++;
            }else {
                right--;
            }
        }
        return res;
    }

    public int orchestraLayout(int num, int xPos, int yPos) {
        int left=1,right=num,up=1,down=num;
        xPos++;
        yPos++;
        int nums=0;
        int tier=Math.min(Math.min(xPos-up,down-xPos),Math.min(yPos-left,right-yPos));
        BigInteger temp=new BigInteger(String.valueOf(num));
        BigInteger multiply = temp.multiply(temp);
        BigInteger a=new BigInteger(String.valueOf(num-tier*2));
        a=a.multiply(a);
        temp = multiply.subtract(a).mod(new BigInteger("9"));
        int size=temp.intValue();
        nums+=size;
        left+=tier;
        right-=tier;
        up+=tier;
        down-=tier;
        if(xPos==up){
            nums+=yPos-left+1;
            nums%=9;
        }else if(xPos==down){
            nums+=right-left+1;
            nums%=9;
            nums+=down-up;
            nums%=9;
            nums+=right-yPos;
            nums%=9;
        }else if(yPos==left){
            nums+=2*(right-left+1);
            nums%=9;
            nums+=down-up-1;
            nums%=9;
            nums+=down-xPos;
            nums%=9;
        }else {
            nums+=right-left+1;
            nums%=9;
            nums+=xPos-up;
            nums%=9;
        }
        return nums==0?9:nums;
    }

    public int magicTower(int[] nums) {
        long sum = 1;
        for(int n : nums){
            sum += n;
        }
        if(sum <= 0) return -1;
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        sum = 1;
        for(int n : nums){
            sum += n;
            if(n < 0) {
                pq.add(n);
            }
            while(sum <= 0) {
                sum -= pq.poll();
                res++;
            }
        }
        return res;
    }

    public int magicTower2(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        if(sum<1){
            return -1;
        }
        int res=0;
        int blood=1;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int num:nums){
            if(num<0){
                priorityQueue.offer(num);
            }
            blood+=num;
            if(blood<=0){
                blood += -priorityQueue.poll();
                res++;
            }


        }
        return res;
    }

    public static void main(String[] args) {
        bisai bisai=new bisai();
        System.out.println(bisai.magicTower(new int[]{100,100,100,-250,-60,-140,-50,-50,100,150}));
    }

}
