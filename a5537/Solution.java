package a5537;

/**
 * @author: chenyu
 * @date: 2020/10/11 11:13
 */
public class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        int len = a.length();
        if (isPalindrome(a, 0, len) || isPalindrome(b, 0, len)) return true;

        //prefixA + suffixB
        int index = 0;
        while (a.charAt(index) == b.charAt(len - 1 - index))    index++;
        if (isPalindrome(a, index, len - index) || isPalindrome(b, index, len - index)) return true;
        //prefixB + suffixA
        index = 0;
        while (a.charAt(len - 1 - index) == b.charAt(index))    index++;
        if (isPalindrome(b, index, len - index) || isPalindrome(a, index, len - index)) return true;

        return false;
    }

    private boolean isPalindrome(String str, int low, int high)
    {
        //high is not contained
        int time = ((high - low) >> 1);
        for (int i = 0;i < time;i++)
        {
            if (str.charAt(low + i) != str.charAt(high - 1 - i))    return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.checkPalindromeFormation("uabcd","aaaau");
    }

}
