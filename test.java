import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/11/30 20:47
 */
public class test {
    public static void heapSort(int[] arr) {
        // 开始位置是最后一个非叶子节点，即最后一个节点的父节点
        int start = (arr.length - 1) / 2;
        // 调整为大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
        // 把数组中的第0个和堆中的最后一个交换位置，再把前面的处理为大顶堆
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    public static void maxHeap(int[] arr, int size, int index) {
        // 左子节点
        int leftNode = 2 * index + 1;
        // 右子节点
        int rightNode = 2 * index + 2;
        int max = index;
        // 和两个子节点分别对比，找出最大的节点
        if (leftNode < size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }
        // 交换位置
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            // 交换位置后，可能会破坏之前排好的堆，所以之前排好的堆要重新调整
            maxHeap(arr, size, max);
        }
    }
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        final int N = 20000000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));
//        ArrayList<Object> list =new ArrayList<Object>();
//        final int N = 20000000;
//        list = new ArrayList<Object>();
//        long startTime1 = System.currentTimeMillis();
//        list.ensureCapacity(N);
//        for (int i = 0; i < N; i++) {
//            list.add(i);
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));
    }
}
