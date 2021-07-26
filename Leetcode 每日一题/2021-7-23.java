class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for(int i = 0; i < ranges.length; i++){
            diff[ranges[i][0]]++;
            diff[ranges[i][1] + 1]--;
        }
        int cur = 0;
        for(int i = 0; i <= 50; i++){
            cur += diff[i];
            if(i >= left && i <= right && cur == 0){
                return false;
            }
        }
        return true;
    }
}