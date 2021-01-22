package offer41;

import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2021/1/22 10:18
 */
public class MedianFinder {
    PriorityQueue<Integer> min,max;
    /** initialize your data structure here. */
    public MedianFinder() {
        min=new PriorityQueue<>((x,y)->(x-y));
        max=new PriorityQueue<>((x,y)->(y-x));
    }

    public void addNum(int num) {
        if(min.size()==max.size()) {
            max.add(num);
            min.add(max.poll());
        }else {
            min.add(num);
            max.add(min.poll());
        }
    }

    public double findMedian() {
        if(max.size()!=min.size()){
            return min.peek();
        }else {
            return (min.peek()+max.peek())*0.5;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder=new MedianFinder();
        medianFinder.addNum(5);
        medianFinder.addNum(2);
        medianFinder.addNum(4);
        medianFinder.addNum(3);
        medianFinder.addNum(1);
        medianFinder.addNum(6);
    }
}
