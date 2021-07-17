class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        for(int i = 0; i < n; i++){
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int min = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            max = Math.max(max, preSum[i] - min);
            min = Math.min(min, preSum[i]);
        }
        return max;
    }
}