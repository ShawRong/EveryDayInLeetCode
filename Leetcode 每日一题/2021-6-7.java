class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        dfs(nums, target, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int target, int depth, int sum){
        if(depth == nums.length && sum == target){
            count++;
            return;
        }
        if(depth >= nums.length){
            return;
        }
        dfs(nums, target, depth + 1, sum + nums[depth]);
        dfs(nums, target, depth + 1, sum - nums[depth]);
    }
}