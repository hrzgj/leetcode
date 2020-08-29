package a207;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/8/4 10:31
 */
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //存放每个节点的入度
        int[] length=new int[numCourses-1];
        for(int[] a:prerequisites){
            length[a[0]]++;
        }
        Queue<Integer> queue=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(length[i]==0){
                queue.offer(i);
            }
        }
        int result=0;
        while (!queue.isEmpty()){
            int a=queue.poll();
            result++;
            for(int[] b:prerequisites){
                if(b[1]==a){
                    length[b[0]]--;
                    if(length[b[0]]==1){
                        queue.offer(b[0]);
                    }
                }
            }
        }
        return result==numCourses;
    }
}

