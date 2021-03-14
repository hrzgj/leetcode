package a706;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/14 12:31
 */
public class MyHashMap {
    class Node{
        int key;
        int val;
        public Node(int key,int val) {
            this.key=key;
            this.val=val;
        }
    }

    int size=10001;
    LinkedList<Node>[] lists;
    /** Initialize your data structure here. */
    public MyHashMap() {
        lists=new LinkedList[size];
        for(int i=0;i<size;i++){
            lists[i]=new LinkedList<Node>();
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int h=key%size;
        for(Node node:lists[h]){
            if(node.key==key){
                node.val=value;
                return;
            }
        }
        lists[h].add(new Node(key,value));
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int h=key%size;
        for(Node node:lists[h]){
            if(node.key==key){
                return node.val;
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int h=key%size;
        Iterator<Node> iterator = lists[h].iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.key == key) {
                lists[h].remove(node);
                return;
            }
        }
    }
}
