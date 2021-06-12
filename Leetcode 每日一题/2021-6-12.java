class Solution {
    public String largestNumber(int[] cost, int target) {
        String[] dp = new String[target + 1];
        for(int i = 0; i  < target + 1; i++){
            dp[i] = "0";
        }
        dp[0] = "";
        for(int i = 1; i < cost.length + 1; i++){
            for(int j = 1; j < target + 1; j++){
                if(j >= cost[i - 1] && dp[j - cost[i - 1]] != "0"){
                    if(dp[j].length() == (i + dp[j - cost[i - 1]]).length()){
                        dp[j] = (dp[j]).compareTo(i + dp[j - cost[i - 1]]) > 0 ? dp[j] : i + dp[j - cost[i - 1]];
                    } else {
                        dp[j] = dp[j].length() > (i + dp[j - cost[i - 1]]).length() ? dp[j] : i + dp[j - cost[i - 1]];
                    }
                }
            }
        }
        return dp[target];
    }
}