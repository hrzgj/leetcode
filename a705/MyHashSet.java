package a705;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/13 9:08
 */
public class MyHashSet {
    int size = 10001;
    LinkedList<Integer>[] linkedLists;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        linkedLists = new LinkedList[size];
    }

    public void add(int key) {
        int finalKey = key % size;
        if (linkedLists[finalKey] == null) {
            linkedLists[finalKey] = new LinkedList<Integer>() {{
                add(key);
            }};
        } else {
            Iterator<Integer> iterator = linkedLists[finalKey].iterator();
            while (iterator.hasNext()) {
                Integer num=iterator.next();
                if(num==key){
                    return;
                }
            }
            linkedLists[finalKey].add(key);
        }
    }

    public void remove(int key) {
        int finaKey = key % size;
        if (linkedLists[finaKey] == null) {
            return;
        } else {
            Iterator<Integer> iterator = linkedLists[finaKey].iterator();
            while (iterator.hasNext()) {
                Integer num=iterator.next();
                if(num==key){
                    linkedLists[finaKey].remove(num);
                    return;
                }
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int finaKey = key % size;
        if (linkedLists[finaKey] == null) {
            return false;
        } else {
            for (Integer integer : linkedLists[finaKey]) {
                if (integer == key) {
                    return true;
                }
            }
            return false;
        }
    }
}
