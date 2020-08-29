package a97;

/**
 * @author: chenyu
 * @date: 2020/7/18 9:27
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n1=s1.length(),n2=s2.length(),n3=s3.length();
        if(n1+n2!=n3){
            return false;
        }
        int i1=0,i2=0,i3=0;
        boolean[] result=new boolean[n3];
        while (i3<n3){
            while (i1<n1&&i3<n3&&s1.charAt(i1)==s3.charAt(i3)){
                result[i3]=true;
                i1++;
                i3++;
            }
            while (i2<n2&&i3<n3&&s2.charAt(i2) == s3.charAt(i3)){
                result[i3]=true;
                i2++;
                i3++;
            }
        }
        for(boolean b:result){
            if(b==false){
                return b;
            }
        }
        return true;
    }

    public boolean isInterleave2(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[][] f = new boolean[n + 1][m + 1];

        f[0][0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[n][m];
    }
}
