class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        map.put(counter, -1);
        for(int i = 0; i < nums.length ;i++){
           int num = nums[i];
           if(num == 1){
               counter++;
           }
           else{
               counter--;
           }
           if(map.cotainsKey(counter)){
               int prevIndex = map.get(counter);
               maxLength = Math.max(maxLength, i - prevIndex);
           }
           else{
               map.put(counter, i);
           }
        }
        return maxLength;
    }
}