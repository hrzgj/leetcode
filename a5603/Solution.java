package a5603;

import com.sun.media.sound.FFT;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/11/15 10:48
 */
public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] size1 =new int[26];
        HashSet<Integer> set=new HashSet<>();
        for(char s:word1.toCharArray()){
            size1[s-'a']++;
            if(!set.contains(s-'a')){
                set.add(s-'a');
            }
        }
        int[] size2=new int[26];
        for(char s:word2.toCharArray()){
            int index=s-'a';
            if(!set.contains(index)) return false;
            size2[s-'a']++;
        }
        for (Integer str : set) {
            int num=size1[str];
            boolean result=false;
            for(int i=0;i<26;i++){
                if(size2[i]==num){
                    result=true;
                    size2[i]=0;
                    break;
                }
            }
            if(!result){
                return false;
            }
        }
        return true;


    }
}
