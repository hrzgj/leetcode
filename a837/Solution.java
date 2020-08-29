package a837;

/**
 * @author: chenyu
 * @date: 2020/6/3 10:19]
 * 爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
 *
 * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。
 *
 * 当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？
 *
 */
class Solution {
    //超出时间限制
    public double new21Game(int N, int K, int W) {
        double[] temp=new double[K+W+1];
        if(K==0){
            return 1.00;
        }
        for(int i=K;i<=N&&i<K+W+1;i++){
            temp[i]=1;
        }
        for(int i=K-1;i>=0;i--){
            for(int j=i+1;j<W+1+i;j++){
                temp[i]+=temp[j]/W;
            }
        }
        return temp[0];
    }

    //超出时间限制
    public double quickNew21Game(int N, int K, int W) {
        if (K == 0) {
            return 1.0;
        }
        double[] dp = new double[K + W + 1];
        for (int i = K; i <= N && i < K + W; i++) {
            dp[i] = 1.0;
        }
        dp[K - 1] = 1.0 * Math.min(N - K + 1, W) / W;
        for (int i = K - 2; i >= 0; i--) {
            dp[i] = dp[i + 1] - (dp[i + W + 1] - dp[i + 1]) / W;
        }
        return dp[0];
    }

}
