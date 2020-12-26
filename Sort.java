import a455.Solution;

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
        private void quickSort(int[] array,int left,int right){
            if(left>=right){
                return;
            }
            int index=partition(array,left,right);
            quickSort(array,left,index-1);
            quickSort(array,index+1,right);
        }

        private int partition(int[] array,int left,int right){
            int i=left+1,j=right;
            while (true){
                while (i!=right&&array[i]<array[left]) i++;
                while (j!=left&&array[j]>array[left]) j--;
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
    }

    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        int[] a=new int[]{2,3,5,1,4};
        sort.quickSort(a,0,a.length-1);
        for(int s:a){
            System.out.println(s);
        }

    }
}
