package a42;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/28 11:58
 */
public class Solution {
    public int trap2(int[] height) {
        if (height.length==0) return 0;
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int l_max = height[0];
        int r_max = height[n - 1];
        while (left <= right) {
            l_max = Math.max(l_max, height[left]);
            r_max = Math.max(r_max, height[right]);
            // res += min(l_max, r_max) - height[i]
            if (l_max < r_max) {
                res += l_max - height[left];
                left++;
            } else {
                res += r_max - height[right];
                right--;
            }
        }
        return res;
    }

    public int trap(int[] height){
        if(height.length==0){
            return 0;
        }
        int res=0;
        LinkedList<Integer> queue=new LinkedList<>();
        int index=0;
        while (index<height.length){
            while (!queue.isEmpty()&&height[index]>height[queue.peekFirst()]){
                int top=queue.pop();
                if(queue.isEmpty()){
                    break;
                }
                int high=Math.min(height[index],height[queue.peekFirst()])-height[top];
                int length=index-1-queue.peekFirst();
                res+=high*length;
            }
            queue.push(index++);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}
