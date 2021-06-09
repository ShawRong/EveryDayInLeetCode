// dp[i][k][j] 在前k个工作中（index from 0 to k - 1）中在i个人数的限定下满足j的最小利率的方案数

class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int mod = (int)1e9 + 7;
        int[][][] dp = new int[n + 1][group.length + 1][minProfit + 1];
        dp[0][0][0] = 1;
        for(int k = 1; k < group.length + 1; k++){
            int fit = profit[k - 1];
            int laborCost = group[k - 1];
            for(int i = 0; i < n + 1; i++){
                for(int j = 0; j < minProfit + 1; j++){
                    dp[i][k][j] = dp[i][k - 1][j] % mod;
                    if(i >= laborCost){
                        dp[i][k][j] = (dp[i - laborCost][k - 1][Math.max(j - fit, 0)] + dp[i][k - 1][j]) % mod;
                    }

                }
            }
        }
        int sum = 0;
        for(int i = 0; i <= n;i++){
            sum = (sum + dp[i][group.length][minProfit]) % mod;
        }
        return sum;
    }
}