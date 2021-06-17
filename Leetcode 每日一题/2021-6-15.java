class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(left < right){
            mid = left + (right - left) / 2;
            if(arr[mid + 1] <= arr[mid]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}