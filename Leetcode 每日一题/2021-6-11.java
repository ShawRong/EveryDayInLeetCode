class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        int num = (int)Math.sqrt(n) + 1;
        for(int i = 1; i < num; i++){
            int val = i * i;
            for(int j = 1; j < n + 1; j++){
                if(j >= val){
                    dp[j] = Math.min(dp[j], dp[j - val] + 1);
                }
            }
        }
        return dp[n];
    }
}