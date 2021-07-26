class Solution {
    public String maximumTime(String time) {
        char[] chrs = time.toCharArray();
        if(chrs[0] == '?'){
            if(chrs[1] < '4' || chrs[1] == '?') chrs[0] = '2';
            else chrs[0] = '1';
        }
        if(chrs[1] == '?'){
            if(chrs[0] == '2'){
                chrs[1] = '3';
            }else{
                chrs[1] = '9';
            }
        }
        if(chrs[3] == '?'){ 
            chrs[3] = '5';
        }
        if(chrs[4] == '?'){
            chrs[4] = '9';
        }
        return new String(chrs);
    }
}