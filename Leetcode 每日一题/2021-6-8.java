class Solution {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int s : stones){
            sum += s;
        }
        int n = stones.length, m = sum / 2;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= m; j++){
                if(stones[i] > j){
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = dp[i][j] || dp[i][j - stones[i]];
                }
            }
        }

        for(int i = m;; i--){
            if(dp[n][i]){
                return sum - 2 * i;
            }
        }
    }
}