package a378;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/7/2 9:27
 */
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        for(int[]a:matrix){
            for(int b:a){
                linkedList.add(b);
            }
        }
        Integer[] a=linkedList.toArray(new Integer[0]);
        Arrays.sort(a);
        return a[k];
    }
}
