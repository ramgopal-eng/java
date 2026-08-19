class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int lt[]=new int [n];
     lt[0]=nums[0];
     for(int i=1;i<n;i++){
        lt[i]=lt[i-1]+nums[i];
     } 
     int rt[]=new int [n];
     rt[n-1]=nums[n-1];
     for(int i=n-2;i>=0;i--){
        rt[i]=rt[i+1]+nums[i];
     }  
     for(int i=0;i<n;i++){
        if(lt[i]==rt[i]){
            return i;
        }
     }
     return -1;
    }
}