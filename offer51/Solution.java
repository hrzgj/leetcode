package offer51;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

/**
 * @author: chenyu
 * @date: 2021/3/17 16:04
 */
public class Solution {
    int res=0;
    public int reversePairs(int[] nums) {
        mergerSort(nums,0, nums.length-1);
        return res;
    }

    private void mergerSort(int[] nums,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergerSort(nums,left,mid);
            mergerSort(nums,mid+1,right);
            merge(nums,mid,left,right);
        }
    }

    private void merge(int[] nums,int mid,int left,int right){
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while (i<=mid&&j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else {
                temp[k++]=nums[j++];
                res+=mid-i+1;
            }
        }
        while (i<=mid){
            temp[k++]=nums[i++];
        }
        while (j<=right){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[x+left]=temp[x];
        }
    }
    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt(),m=scanner.nextInt();
//        int[] a=new int[n+1];
//        int[] b=new int[n+1];
//        for(int i=1;i<=n;i++){
//            a[i]=scanner.nextInt();
//            b[i]=scanner.nextInt();
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int size=scanner.nextInt();
//        while (size-->0){
//            int n=scanner.nextInt(),m=scanner.nextInt(),k=scanner.nextInt();
//            //dp[i][j]表示前i个数组和为j的组合数
//            int[][] dp=new int[n+1][k+1];
//            for(int i=1;i<=m&&i<=k;i++){
//                dp[1][i]=1;
//            }
//            for(int i=2;i<=n;i++){
//                for(int j=i ;j<=i*m && j<=k;j++){
//                    for(int l=1;l<=m && j-l>0;l++){
//                        dp[i][j]+=dp[i-1][j-l];
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static int  back(int k,int n,int m,long res){
//        if(n==0 && k==0){
//            res++;
//            if(res>1000000007) {
//                res %= 1000000007;
//            }
//            return (int)res;
//        }
//        if(n<=0 || k<=0 ){
//            return 0;
//        }
//        if(k-n*m>0){
//            return 0;
//        }
//        for(int i=1;i<=m;i++){
//            if(k-i<0){
//                break;
//            }
//            res+=back(k-i,n-1,m,0);
//        }
//        return (int)res;
//    }

//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n,m;
//        n=sc.nextInt();
//        m=sc.nextInt();
//        int[] num=new int[n];
//        for(int i=0;i<num.length;i++){
//            num[i]=sc.nextInt();
//        }
//        Map<Integer,List<Integer>> map=new HashMap<>();
//        while (sc.hasNext()){
//            int i=sc.nextInt()-1,j=sc.nextInt()-1;
//            if(map.containsKey(i)){
//                map.get(i).add(j);
//            }else {
//                map.put(i,new LinkedList<Integer>(){{add(j);}});
//            }
//            if(map.containsKey(j)){
//                map.get(j).add(i);
//            }else {
//                map.put(j,new LinkedList<Integer>(){{add(i);}});
//            }
//        }
//        int res=1;
//        for(int i=0;i<num.length;i++){
//            int temp=1;
//            LinkedList<Integer> list=new LinkedList<>();
//            list.add(i);
//            while (!list.isEmpty()) {
//                int size=list.size();
//                while (size-->0) {
//                    int index=list.poll();
//                    int value=num[index];
//                    for (Integer integer : map.get(index)) {
//                        if(num[integer]<value){
//                            list.add(integer);
//                        }
//                    }
//                }
//                temp++;
//            }
//            res=Math.max(res,temp);
//        }
//        System.out.println();
//        System.out.println(res);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n,m;
//        while (sc.hasNext()) {
//            n=sc.nextInt();
//            m=sc.nextInt();
//            long[] nums=new long[n];
//            for(int i=0;i<nums.length;i++){
//                nums[i]=sc.nextInt();
//            }
//            Map<Long,Integer> map=new HashMap<>();
//            System.out.println();
//            for(int i=0;i<m;i++){
//                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//            }
//            long max=0,num=Integer.MAX_VALUE;
//            for(Map.Entry<Long,Integer> entry:map.entrySet()){
//                if(entry.getValue()>max){
//                    num=entry.getKey();
//                    max=entry.getValue();
//                }else if(entry.getValue()==max){
//                    num=Math.min(num,entry.getKey());
//                }
//            }
//            System.out.println(num);
//            for(int i=m;i<n;i++){
//                max=0;
//                num=Integer.MAX_VALUE;
//                map.put(nums[i-m], map.get(nums[i - m]) - 1);
//                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//                for(Map.Entry<Long,Integer> entry:map.entrySet()){
//                    if(entry.getValue()>max){
//                        num=entry.getKey();
//                        max=entry.getValue();
//                    }else if(entry.getValue()==max){
//                        num=Math.min(num,entry.getKey());
//                    }
//                }
//                System.out.println(num);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s=sc.nextLine();
//            List<Long> list=new LinkedList<>();
//            char[] ch=s.toCharArray();
//            for(int i=0;i<ch.length;i++){
//                if(Character.isDigit(ch[i])){
//                    int  sign= i>0 && ch[i-1]=='-'?-1:1;
//                    long num=0;
//                    while (i<ch.length&&Character.isDigit(ch[i])){
//                        num*=10;
//                        num+=ch[i]-'0';
//                        i++;
//                    }
//                    list.add(num * sign);
//                }
//            }
//            Collections.sort(list);
//            System.out.println();
//            for(Long i:list){
//                System.out.println(i);
//            }
//        }
//    }
//    public static int[][] reverse(int[][] num) {
//        int n=num.length,m=num[0].length;
//        int[][] res=new int[m][n];
//        int column=0,row=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                res[row][column++]=num[i][j];
//                if(column==n){
//                    row++;
//                    column=0;
//                }
//            }
//        }
//        return res;
//    }
//
//
//    public static void main(String[] args) {
//        int m,n;
//        double sum;
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            n = sc.nextInt();
//            m = sc.nextInt();
//            int[][] num=new int[n][m];
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    num[i][j]=sc.nextInt();
//                }
//            }
//            int[][] res=new int[m][n];
//            int column=0,row=0;
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    res[row++][column]=num[i][j];
//                    if(row==m){
//                        column++;
//                        row=0;
//                    }
//                }
//            }
//            System.out.println();
//            for(int i=0;i<m;i++){
//                for(int j=0;j<n;j++){
//                    System.out.printf(res[i][j]+"");
//                }
//                System.out.println();
//            }
//        }
//    }
}
