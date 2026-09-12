class Solution {
    public boolean judgeSquareSum(int c) {
        long lo=0;
       long hi=(long)Math.sqrt(c);
        while(lo<=hi){
          long ans=lo*lo+hi*hi;
        if(ans==c){
            return true;
        }
        else if(ans<c){
            lo++;
        }
        else {
            hi--;
        }
            
        }
        return false;
    }
}