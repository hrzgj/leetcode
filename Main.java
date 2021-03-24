import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2021/3/13 16:09
 */
  class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
    }
  }


  class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
      this.val = val;
    }
  }
public class Main {

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        //price[][i][0]代表金额
//        //price[][i][1]代表金额%m,余数
//        int j=0;
//        int[][][] prices=new int[size][][];
//        int [] mNum=new int[size];
//        while (size-->0){
//            int n=sc.nextInt();
//            int m=sc.nextInt();
//            mNum[j]=m;
//            int[][] price=new int[n][2];
//            //price[i][0]代表金额
//            //price[i][1]代表金额%m,余数
//            int index=-1;
//            while (++index<price.length){
//                price[index][0]=sc.nextInt();
//                price[index][1]=price[index][0]%m;
//            }
//            prices[j++]=price;
//        }
//
//        for ( j = 0; j < prices.length; j++) {
//            int[][] price=prices[j];
//            int m=mNum[j];
//            Arrays.sort(price, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    if (o1[1] == o2[1]) {
//                        return o2[0] - o1[0];
//                    } else {
//                        return o1[1] - o2[1];
//                    }
//                }
//            });
//            int left = 0, right = price.length - 1;
//            int res = 0;
//            while (left <= right) {
//                int leftNum = price[left][1];
//                int rightNum = price[right][1];
//                if (leftNum + rightNum == m || leftNum + rightNum == 0) {
//                    left++;
//                    right--;
//                } else if (leftNum + rightNum > m) {
//                    res += price[right][0];
//                    right--;
//                } else if (leftNum + rightNum < m) {
//                    res += price[left][0];
//                    left++;
//                }
//            }
//            System.out.print(res);
//            System.out.println();
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        LinkedList<int[]> list=new LinkedList<>();
////        int n=sc.nextInt();
////        while (n-->0) {
////            int size=sc.nextInt();
////            int[] temp=new int[size];
////            int index=0;
////            while (index<temp.length) {
////                int num=sc.nextInt();
////                temp[index++]=num;
////            }
////            list.add(temp);
////        }
////        int q=sc.nextInt();
////        int[][] res=new int[q][];
////        int p=0;
////        while (q-->0){
////            int arraySize=sc.nextInt();
////            int[] index=new int[arraySize+1];
////            res[p++]=index;
////            int j=0;
////            while (arraySize-->0){
////                int num=sc.nextInt();
////                index[j++]=num-1;
////            }
////            int k=sc.nextInt();
////            index[j]=k;
////
////        }
////        int index=0;
////        while (index<res.length) {
////            int[] nums=res[index++];
////            int k=nums[nums.length-1];
////            //构建小顶堆
////            PriorityQueue<Integer> queue = new PriorityQueue<>(nums[nums.length-1], new Comparator<Integer>() {
////                @Override
////                public int compare(Integer o1, Integer o2) {
////                    return o2 - o1;
////                }
////            });
////            for (int i=0;i<nums.length-1;i++) {
////                Integer integer=nums[i];
////                int[] array = list.get(integer);
////                for (int num : array) {
////                    if (queue.size() < k) {
////                        queue.add(num);
////                    } else {
////                        if (queue.peek() < num) {
////                        } else {
////                            queue.poll();
////                            queue.add(num);
////                        }
////                    }
////                }
////            }
////            System.out.print(queue.peek());
////            System.out.println();
////        }
//
//
//
//
//
//
//
//
//
//
//
//
////        int size=sc.nextInt();
////        while (size-->0){
////            int n=sc.nextInt();
////            int[] dp=new int[n+1];
////            for(int i=1;i<=n;i++){
////                if(i%3==0 && i%2==0) {
////                    dp[i] = Math.min(dp[i - 1], Math.min(dp[i / 3], dp[i / 2])) + 1;
////                }else if(i%3==0){
////                    dp[i]=Math.min(dp[i-1],dp[i/3])+1;
////                }else if(i%2==0){
////                    dp[i]=Math.min(dp[i-1],dp[i/2])+1;
////                }else {
////                    dp[i]=dp[i-1]+1;
////                }
////            }
////            System.out.println(dp[n]);
////        }
//
//
//
////        Main main=new Main();
////        TreeNode node=new TreeNode(1);
////        node.left=new TreeNode(2);
////        node.right=new TreeNode(3);
////        TreeNode res=node;
////        node=node.left;
////        node.left=new TreeNode(4);
////        node.right=new TreeNode(5);
////        main.solve(res,new int[5]);
//    }
//    public ListNode[] solve (TreeNode root, int[] b) {
//        if(root==null){
//            return new ListNode[0];
//        }
//        ListNode[] res=new ListNode[b.length];
//        for (int i = 0; i <b.length ; i++) {
//            dfs(root,new LinkedList<>(),b[i],res,i);
//        }
//        return res;
//
////        int m = b.length;
////        ListNode[] result = new ListNode[m];
////        int k = 0;
////        List<Integer> nums = new LinkedList<>();
////        Deque<TreeNode> deque = new LinkedList<>();
////        deque.addLast(root);
////        while (!deque.isEmpty()){
////            TreeNode node = deque.pollFirst();
////            tree.add(node.val);
////            if (node.left != null) deque.addLast(node.left);
////            if (node.right != null) deque.addLast(node.right);
////        }
////        int n = nums.size();
////        for (int i = 0; i < m; i++) {
////            int index = nums.indexOf(b[i]);
////            boolean flag = index == 0 ? true : false;
////            ListNode head = null,node = null;
////            while (!flag){
////                head = new ListNode(nums.get(index));
////                head.next = node;
////                node = head;
////                index = (index-1)/2;
////                if (flag)   break;
////                if (index == 0) flag = true;
////            }
////            head = new ListNode(tree.get(0));
////            head.next = node;
////            ans[k++] = head;
////        }
////        return result ;
//    }
//
//    private boolean dfs(TreeNode node,LinkedList<Integer> list,int val,ListNode[] listNodes,int i){
//        if(node.val==val){
//            list.add(node.val);
//            cloneNode(listNodes,i,list);
//            return true;
//        }
//        list.add(node.val);
//        if(dfs(node.left,list,val,listNodes,i)){
//            return true;
//        }
//        dfs(node.right,list,val,listNodes,i);
//        list.remove(list.size()-1);
//        return false;
//    }
//
//    private void cloneNode(ListNode[] listNodes,int i,LinkedList<Integer> list){
//        ListNode node=new ListNode(0);
//        ListNode head=node;
//        for(int val:list){
//            node.next=new ListNode(val);
//            node=node.next;
//        }
//        listNodes[i]=head.next;
//    }
}