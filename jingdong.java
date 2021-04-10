import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/4/10 18:53
 */
public class jingdong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        int left=num[0];
        int res=0;
        int i=1;
        while (num[i]==left){
            res++;
            i++;
        }
        int right=num[i];
        i++;
        while (i<n) {
            if(num[i]==left){
                res++;
            }else if(num[i]==right){
                res++;
            }else {
                int j=i;
                while (j<n && num[j]!=left && num[j]!=right){
                    j++;
                }
                if(j>=n){
                    left=num[i];
                }
                else if(num[j]==left){
                    right=num[i];
                }else {
                    left=num[i];
                }
            }
            i++;
        }
        System.out.println(res);
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] k=new int[n];
//        int[] b=new int[n];
//        for (int i = 0; i <n ; i++) {
//            k[i]=sc.nextInt();
//            b[i]=sc.nextInt();
//        }
//        Map<Integer,List<Integer>> map=new HashMap<>();
//        int[] res=new int[n-1];
//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j <n ; j++) {
//                if(k[j]==k[i]){
//                    continue;
//                }
//                if((b[i]-b[j])%(k[j]-k[i])!=0 ){
//                    continue;
//                }
//                int x=(b[i]-b[j])/(k[j]-k[i]);
//                if(x<0){
//                    continue;
//                }
//                int y=k[i]*x+b[i];
//                if(map.containsKey(x)){
//                    List<Integer> list=map.get(x);
//                    boolean flag=false;
//                    for(Integer integer:list){
//                        if(integer==y){
//                            flag=true;
//                            break;
//                        }
//                    }
//                    if(flag){
//                        continue;
//                    }
//                    list.add(y);
//                    map.put(x,list);
//                }else {
//                    map.put(x,new LinkedList<Integer>(){{add(y);}});
//                }
//                int size=0;
//                for (int l = 0; l <n ; l++) {
//                    if((k[l]*x+b[l])==y){
//                        size++;
//                    }
//                }
//                res[size-2]++;
//            }
//        }
//        for (int i = 0; i <n-1 ; i++) {
//            System.out.print(" ");
//            System.out.print(res[i]);
//        }
//    }
}
