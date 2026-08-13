class Solution {
    public boolean isPerfectSquare(int num) {
        
       int  lo=0;
       int hi=num;
       while(lo<=hi){
        int mid=(lo+hi)/2;
        long sq=(long)mid*mid;
        if(sq == num) return true;
        else if(sq>num)hi=mid-1;
        else lo=mid+1;

       }
       
    
    return false;
    }
}