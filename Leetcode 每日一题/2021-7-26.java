class Solution {
    public int minOperations(int[] target, int[] arr) {
        int n = target.length;
        int m = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(target[i], i);
        }  
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int x = arr[i];
            if(map.containsKey(x)) list.add(map.get(x));
        }

        int len = list.size();
        if(len == 0) return n;
        int[] d = new int[len];
        d[0] = list.get(0);
        int top = 0;
        for(int i = 1; i < len; i++){
            if(d[top] < list.get(i)){
                d[++top] = list.get(i);
            }else{
                int l = 0, r = top;
                while(l < r){
                    int mid = (r - l) / 2 + l;
                    if(d[mid] >= list.get(i)) r = mid;
                    else l = mid + 1;
                } 
                d[l] = list.get(i);
            }
        }
        return n - (top + 1);
    }
}