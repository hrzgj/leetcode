package a990;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: chenyu
 * @date: 2020/6/8 9:16
 */
class Solution {
    public boolean equationsPossible(String[] equations) {
        int length = equations.length;
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        for (String str : equations) {
            if (str.charAt(1) == '=') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String str : equations) {
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }

    //失败了
    public boolean equationsPossible2(String[] equations) {
        Map<Character,Character> map=new HashMap<>();
        for(String equation:equations){
            char character=equation.charAt(0);
            Character first=map.get(character);
            if(first==null){
                first=character;
                map.put(character,first);
            }
            character=equation.charAt(1);
            if(character=='!'){
                Character c=equation.charAt(3);
                Character temp=map.get(c);
                if(temp!=null){
                    if(first.equals(temp)){
                        return false;
                    }
                }else {
                    map.put(c,character);
                }
            }
            else {
                Character c=equation.charAt(3);
                Character temp=map.get(c);
                if(temp!=null){
                    if(!first.equals(temp)){
                        return false;
                    }
                }else {
                    map.put(c,first);
                }
            }
        }
        return true;
    }
}