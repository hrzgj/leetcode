import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/4/1 18:59
 */
public class xiecheng {
    static int res=Integer.MAX_VALUE;
    static int[] price;
    static Map<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        String[] ss=s.split(" ");
        String priceString=sc.nextLine();
        String valueString=sc.nextLine();
        String[] p=priceString.split(" ");
        String[] v=valueString.split(" ");
        price=new int[ss.length];
        int[] value=new int[ss.length];
        for (int i = 0; i <price.length ; i++) {
            price[i]=Integer.parseInt(p[i]);
        }
        for (int i = 0; i <price.length ; i++) {
            value[i]=Integer.parseInt(v[i]);
            map.put(value[i],0);
        }
        HashSet<Integer>[] sets=new HashSet[ss.length];
        for (int i = 0; i < ss.length; i++) {
            String[] s1=ss[i].split(",");
            sets[i]=new HashSet<>();
            for(String temp:s1){
                sets[i].add(Integer.parseInt(temp));
            }
        }
        back(sets,0,0);
        System.out.println(res);
    }

    private static void back(HashSet<Integer>[] sets,int index,int result){
        if(index>=sets.length){
            if(check()){
                res=Math.min(res,result);
            }
            return;
        }
        boolean flag=false;
        for(Integer i:sets[index]){
            if(map.get(i)<0){
                flag=true;
                break;
            }
        }
        if(flag) {
            for (Integer i : sets[index]) {
                map.put(i, map.get(i) + 1);
            }
            back(sets, index + 1, result + price[index]);
            for (Integer i : sets[index]) {
                int value = map.get(i);
                map.put(i, value - 1);
            }
            back(sets, index + 1, result);
        }else {
            back(sets,index+1,result);
        }
    }

    private static boolean check(){
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<=0){
                return false;
            }
        }
        return true;
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        StringBuilder sb=new StringBuilder();
//        while (sc.hasNextLine()){
//            String s=sc.nextLine();
////            s=s.replaceAll(" ","");
//            sb.append(s).append(" ");
//        }
//        String[] list=sb.toString().split(" ");
//        List<String> res=new LinkedList<>();
//        HashSet<String> set=new HashSet<>();
//        for(String s:list){
//            int left=0,right=4;
//            while (right<=s.length()) {
//                String s1 = s.substring(left, right);
//                if ("from".equals(s1) || "join".equals(s1)) {
//                    right++;
//                    if ((Character.isLowerCase(s.charAt(right)) || Character.isUpperCase(s.charAt(right)))) {
//                        left = right;
//                        while (true) {
//                            boolean flag=false;
//                            while ((right < s.length() && s.charAt(right) != ',' )) {
//                                if(s.charAt(right)==' '){
//                                    flag=true;
//                                    break;
//                                }
//                                right++;
//                            }
//                            if(flag){
//                                break;
//                            }
//                            String temp = s.substring(left, right);
//                            if (!set.contains(temp)) {
//                                res.add(temp);
//                                set.add(temp);
//                            }
//                            left = right + 1;
//                            right++;
//                        }
//                    }
//                }
//                left++;
//                right++;
//            }
//        }
//        for(String s:res){
//            System.out.println(s);
//        }
//    }
}
