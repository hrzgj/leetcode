package a381;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/10/31 8:55
 */
public class RandomizedCollection {
    private HashMap<Integer,Integer> map;
    private List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map=new HashMap<>();
        list=new LinkedList<>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        list.add(val);
        int vals=map.getOrDefault(val,0);
        if(vals==0){
            map.put(val,1);
            return true;
        }else {
            map.put(val,vals+1);
            return false;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        int vals=map.getOrDefault(val,0);
        Integer a=val;
        if(vals==0){
            return false;
        }else if(vals==1){
            list.remove(a);
            map.remove(val);
            return true;
        }else {
            list.remove(a);
            map.put(val,vals-1);
            return true;
        }
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        int i=new Random().nextInt(list.size());
        return list.get(i);
    }
}
