import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/3/27 15:37
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int left=0,right=0;
        char[] ch=s.toCharArray();
        int[] nums=new int[]{1,8,0,7};
        int one=0,eight=0,zero=0,serve=0;
        for(char c:ch) {
            int num=c-'0';
            if(num==1) {
                one++;
                if(eight>0) {
                    eight--;
                }else if(zero>0) {
                    zero--;
                }else if(serve>0) {
                    serve--;
                }
            }
            if(num==8) {
                eight++;
                if(zero>0) {
                    zero--;
                }else if(serve>0) {
                    serve--;
                }
            }
            if(num==0) {
                zero++;
                if(serve>0) {
                    serve--;
                }
            }
            if(num==7) {
                serve++;
            }
        }
        System.out.print(one+eight+zero+serve);
    }



//    static void back(char[] ch,int index,int)

//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int left=scanner.nextInt(),right=scanner.nextInt();
//        int l=left,r=right;
//        int odd=0,add=0;
//        int i = left;
//        for (; i <= right ; i++) {
//            int temp=i;
//            boolean flag=false;
//            while (temp!=0){
//                if(flag){
//                    add+=temp%10;
//                }else {
//                    odd+=temp%10;
//                }
//                flag=!flag;
//                temp/=10;
//            }
//            if(add==odd){
//                left=i;
//                break;
//            }else {
//                add=0;
//                odd=0;
//            }
//        }
//        add=0;
//        odd=0;
//        for (int j = right; j >=left ; j--) {
//            boolean flag=false;
//            int temp=j;
//            while (temp!=0){
//                if(flag){
//                    add+=temp%10;
//                }else {
//                    odd+=temp%10;
//                }
//                flag=!flag;
//                temp/=10;
//            }
//            if(add==odd){
//                right=j;
//                break;
//            }else {
//                add=0;
//                odd=0;
//            }
//        }
//        System.out.print((right-left)/11+1);
//        if(left%11==0 && right%11==0){
//            System.out.print((right-left)/11+1);
//        }else if(left%11!=0 && right %11 ==0){
//            System.out.print((right-left)/11);
//        }
//        else if(left % 11 != 0){
//            System.out.print((right-left)/11-1);
//        }else if(right %11 !=0){
//            System.out.print((right-left)/11);
//        }

    }
//    static int res=Integer.MAX_VALUE;
//    static int T;
//    static int y;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        T=sc.nextInt();
//        y=sc.nextInt();
//        List<Integer> list=new LinkedList<>();
//        while (sc.hasNext()){
//            list.add(Integer.valueOf(sc.next()));
//        }
//        back(list,0,0);
//        System.out.print(res-y);
//    }
//
//    public static void back(List<Integer> list,int index,int sum){
//        if(index>=list.size()){
//            return;
//        }
//        if(sum>T){
//            res=Math.min(sum,res);
//            return;
//        }
//        if(sum<T) {
//            back(list, index + 1, sum + list.get(index));
//        }
//        back(list,index+1,sum);
//    }
//    static int res=0;
//    static Map<Integer,Integer> map=new HashMap<>();
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] nums=new int[n];
//        int sum=0;
//        LinkedList<Integer>[] lists=new LinkedList[6];
//        for (int i = 0; i < lists.length; i++) {
//            lists[i]=new LinkedList<>();
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=sc.nextInt();
//            lists[nums[i]%6].add(nums[i]);
//            sum+=nums[i];
//        }
//        int a=sum%6;
//        Collections.sort(lists[a]);
//        if(lists[a].size()<=0){
//            System.out.print(-1);
//        }else {
//            System.out.print(sum-lists[a].get(0));
//        }
//    }
//
//    public static void back(int[] nums,int index,int sum){
//        if(index>=nums.length){
//            return;
//        }
//        if(sum%6==0){
//            int value=map.getOrDefault(index,0);
//            map.put(index,Math.max(res,value));
//            res=Math.max(sum,res);
//        }
//        back(nums,index+1,sum+nums[index]);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] nums=new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i]=sc.nextInt();
//        }
//        int right=-1,left=0;
//        int res=0;
//        int add=0,sub=0;
//        boolean addFlag=false,subFlag=false;
//        boolean flag=false;
//        while (++right<n-1){
//            int a=nums[right+1]-nums[right];
//            if(a==0){
//                add=0;
//                sub=0;
//                addFlag=false;
//                subFlag=false;
//                flag=false;
//                left=right;
//                continue;
//            }else if(a>0){
//                if(subFlag){
//                    add=0;
//                    sub=0;
//                    addFlag=false;
//                    subFlag=false;
//                    left=right;
//                    flag=false;
//                    continue;
//                }
//                subFlag=false;
//                add++;
//            }else if(a<0){
//                if(addFlag){
//                    add=0;
//                    sub=0;
//                    addFlag=false;
//                    subFlag=false;
//                    flag=false;
//                    left=right;
//                    continue;
//                }
//                addFlag=false;
//                sub++;
//            }
//            if(add==2){
//                add=0;
//                subFlag=true;
//            }
//            if(sub==2){
//                sub=0;
//                addFlag=true;
//            }
//            if(flag || (addFlag && subFlag)) {
//                flag=true;
//                addFlag=false;
//                subFlag=false;
//                res = Math.max(res, right - left + 1);
//            }
//
//        }
//        if(flag || (addFlag && subFlag)) {
//            res = Math.max(res, right - left + 1);
//        }
//        System.out.print(res);
//    }

