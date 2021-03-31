import a455.Solution;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/12/25 10:54
 */
public class Sort {
    static class MergeSort{
        public int[] mergeSort(int[] array,int low,int high){
            int mid=(low+high)/2;
            if(low<high){
                mergeSort(array,low,mid);
                mergeSort(array,mid+1,high);
                merge(array,low,mid,high);
            }
            return array;
        }

        public void merge(int[] array,int low,int mid,int high){
            int[] temp=new int[high-low+1];
            int i=low,j=mid+1,k=0;
            while (i<=mid&&j<=high){
                if(array[i]<array[j]){
                    temp[k++]=array[i++];
                }else {
                    temp[k++]=array[j++];
                }
            }
            while(i<=mid){
                temp[k++] = array[i++];
            }
            while(j<=high){
                temp[k++] = array[j++];
            }
            // 把新数组中的数覆盖nums数组
            for(int x=0;x<temp.length;x++){
                array[x+low] = temp[x];
            }
        }
    }

    static class QuickSort{
        private void quickSort(int[] array,int left,int right) {
            if(left>=right){
                return;
            }
            int mid=partition(array,left,right);
            quickSort(array,left,mid-1);
            quickSort(array,mid+1,right);

        }
        private int partition(int[] array,int left,int right){
            int i=left+1,j=right;
            while (true){
                while (i!=right && array[i]<array[left]) i++;
                while (j!=left && array[j]>array[right]) j--;
                if(i>=j){
                    break;
                }
                swap(array,i,j);
            }
            swap(array,left,j);
            return j;
        }
        private void swap(int[] array,int i,int j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }

        public int search(int[] array,int target){
            int left=0,right=array.length-1;
            while (left<right){
                int mid=left+(right-left)/2;
                if(array[mid]>=target){
                    right=mid;
                }else {
                    left=mid+1;
                }
            }
            return left;
        }
    }

    static class HeapSort{
        private static void swap(int[] array,int i,int j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        public static int[] heapSort(int[] array){
            int len=array.length;
            for(int i=len/2-1;i>=0;i--){
                heapAdjust(array,i,len);
            }
            for(int i=len-1;i>=0;i--){
                swap(array,0,i);
                heapAdjust(array,0,i);
            }
            return array;
        }
        public static void heapAdjust(int[] array,int index,int length){
            int max=index;
            int left=index*2;
            int right=index*2+1;
            if(length > left && array[left]>array[max]){
                max=left;
            }
            if(length > right && array[right]>array[max]){
                max=right;
            }
            if(max!=index){
                swap(array,max,index);
                heapAdjust(array,max,length);
            }
        }

    }

    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        int[] a=new int[]{1,2,2,3,4,5,6};
        System.out.println(sort.search(a,2));

    }
}
