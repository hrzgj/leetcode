package a406;


import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/11/16 16:38
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.reconstructQueue(new int[][]{
                {7,0},{4,4},{7,1},{5,0},{6,1},{5,2}
        });
    }
}
