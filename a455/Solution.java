package a455;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/12/25 10:35
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex=0,sIndex=0;
        while (gIndex<g.length&&sIndex<s.length){
            if(g[gIndex]<=s[sIndex]){
                res++;
                gIndex++;
            }
            sIndex++;
        }
        return res;
    }
}
