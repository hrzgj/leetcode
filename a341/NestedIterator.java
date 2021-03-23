package a341;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/3/23 10:22
 */
interface NestedInteger {

              // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();
              // @return the single integer that this NestedInteger holds, if it holds a single integer
              // Return null if this NestedInteger holds a nested list
              public Integer getInteger();

              // @return the nested list that this NestedInteger holds, if it holds a nested list
              // Return null if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
}
public class NestedIterator implements Iterator<Integer> {

    ArrayList<Integer> list=new ArrayList<>();
    int index=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        add(nestedList);
    }

    private void  add(List<NestedInteger> nestedList) {
        for(NestedInteger integer:nestedList){
            if(integer.isInteger()){
                list.add(integer.getInteger());
            }else {
                add(integer.getList());
            }
        }
    }

    @Override
    public Integer next() {
        if(hasNext()){
            return list.get(index++);
        }else {
            return null;
        }

    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }
}