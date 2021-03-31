import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/3/31 18:58
 */
public class huawei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","");
        String res=s.substring(1,s.length()-1);
        if(res.length()<=0){
            System.out.println(0);
            return;
        }
        String[] strings=res.split(",");
        int[] nums=new int[strings.length];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(nums);
        int result=nums.length;
        int n=nums.length;
        int left=0,right=0;
        while (left<n){
            int num=nums[left];
            while (right<n && nums[++right]==nums[left]);
            int size=right-left;
            size%=num;
            result+=num-size+1;
            left=right;
        }
        System.out.println(result);
    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        List<String> list=new LinkedList<>();
//        while (scanner.hasNext()){
//            list.add(scanner.nextLine());
//        }
//        Map<Character,Integer> map=new HashMap<>();
//        for(String s:list){
//            char[] ch=s.toCharArray();
//            if(ch[4]>ch[6]){
//                map.put(ch[0],map.getOrDefault(ch[0],0)+3);
//            }else if(ch[4]<ch[6]){
//                map.put(ch[2],map.getOrDefault(ch[2],0)+3);
//            }else {
//                map.put(ch[0],map.getOrDefault(ch[0],0)+1);
//                map.put(ch[2],map.getOrDefault(ch[2],0)+1);
//            }
//        }
//        TreeMap<Integer,PriorityQueue<Character>> treeMap=new TreeMap<>(((o1, o2) -> o2-o1));
//        for(Map.Entry<Character,Integer> entry:map.entrySet()){
//            PriorityQueue<Character> queue=treeMap.getOrDefault(entry.getValue(),new PriorityQueue<>(((o1, o2) -> o2-o1)));
//            queue.add(entry.getKey());
//            treeMap.put(entry.getValue(),queue);
//        }
//        StringBuilder stringBuilder=new StringBuilder();
//        for(Map.Entry<Integer,PriorityQueue<Character>> entry:treeMap.entrySet()){
//            int score=entry.getKey();
//            for(Character c:entry.getValue()){
//                stringBuilder.append(c).append(' ').append(score).append(',');
//            }
//        }
//        stringBuilder.deleteCharAt(stringBuilder.length()-1);
//        System.out.println(stringBuilder);
//
//
//    }
}
