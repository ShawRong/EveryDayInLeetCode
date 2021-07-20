class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int range = n / 2;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < range; i++){
            if(nums[i] + nums[n - i - 1] > max){
                max = nums[i] + nums[n - i - 1];
            }
        }
        return max;
    }
}