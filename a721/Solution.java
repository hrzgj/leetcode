package a721;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/1/18 20:21
 */
public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Union union = new Union(accounts.size());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> list = accounts.get(i);
            for (int j = 1; j < list.size(); j++) {
                String mail = list.get(j);
                if (hashMap.containsKey(mail)) {
                    union.union(hashMap.get(mail), i);
                } else {
                    hashMap.put(mail, i);
                }
            }
        }
        HashMap<Integer,TreeSet<String>> map=new HashMap<>();
        for(int i=0;i<accounts.size();i++){
            int index=union.find(i);
            List<String> account=accounts.get(i);
            List<String> mail=account.subList(1,account.size());
            if(map.containsKey(index)){
                map.get(index).addAll(mail);
            }else {
                map.put(index,new TreeSet<>(mail));
            }
        }
        List<List<String>> lists = new ArrayList<>(union.count);
        for(Map.Entry<Integer,TreeSet<String>> entry:map.entrySet()){
            List<String> tmp = new LinkedList<>();
            int index = entry.getKey();
            String name = accounts.get(index).get(0);
            tmp.add(name);
            tmp.addAll(entry.getValue());
            lists.add(tmp);
        }
        return lists;
    }

    public class Union {
        int[] parent;
        int count;
        int[] size;

        public Union(int n) {
            count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (size[rootX] > size[rootY]) {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            } else {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            }
            count--;
        }

        public int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }
    }
}
