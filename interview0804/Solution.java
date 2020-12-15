package interview0804;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/15 15:40
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>(){{add(new LinkedList<>());}};
        for (int num : nums) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = new LinkedList<>(res.get(j));
                list.add(num);
                res.add(list);
            }
        }
        return res;
    }
}
