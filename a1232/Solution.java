package a1232;

/**
 * @author: chenyu
 * @date: 2021/1/19 10:10
 */
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2){
            return true;
        }
        int n=coordinates.length;
        int x1=coordinates[0][0],x2=coordinates[1][0];
        if(x1==x2){
            for(int i=2;i<n;i++){
                if(coordinates[i][0]!=x1){
                    return false;
                }
            }
            return true;
        }
        double k=(coordinates[1][1]-coordinates[0][1])*1.0/(x2-x1);
        double a=coordinates[1][1]-k*x2;
        for(int i=2;i<n;i++){
            if(coordinates[i][0]*k+a!=coordinates[i][1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.checkStraightLine(new int[][]{{2,1},{4,2},{6,3}});
    }
}
