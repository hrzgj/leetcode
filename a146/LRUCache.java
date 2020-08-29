package a146;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/5/25 16:31
 */
public class LRUCache {

    class LinkedNode {
        int key;
        int vale;
        LinkedNode next;
        LinkedNode pre;

        public LinkedNode() {
        }

        public LinkedNode(int _key, int _value) {
            key = _key;
            vale = _value;
        }
    }

    private int capacity;
    private int size;
    private Map<Integer, LinkedNode> map = new HashMap<>();
    private LinkedNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head = new LinkedNode();
        tail = new LinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        LinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.vale;
    }

    public void put(int key, int value) {
        LinkedNode node = map.get(key);
        if (node == null) {
            // 如果 key 不存在，创建一个新的节点
            LinkedNode newNode = new LinkedNode(key, value);
            // 添加进哈希表
            map.put(key, newNode);
            // 添加至双向链表的头部
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                // 如果超出容量，删除双向链表的尾部节点
                LinkedNode tail = removeTail();
                // 删除哈希表中对应的项
                map.remove(tail.key);
                --size;
            }
        } else {
            // 如果 key 存在，先通过哈希表定位，再修改 value，并移到头部
            node.vale = value;
            moveToHead(node);
        }
    }


    private void addToHead(LinkedNode node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(LinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(LinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private LinkedNode removeTail() {
        LinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }
}


