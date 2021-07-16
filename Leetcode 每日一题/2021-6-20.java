class Solution {
    public int search(int[] nums, int target) {
        int cnt = 0;
        for(int num : nums) {
            if(num == target){
                cnt++;
            }
        }
        return cnt;
    }
}