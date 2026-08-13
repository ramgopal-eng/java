class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int ans=0;
        if(n==1)return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1]; 
        while(l<=r){
            int mid=l+(r-l);
            int fo=mid;
            int so=mid;          
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
           else if(nums[mid]==nums[mid-1]){
             fo=mid-1;
           } 
           else so=mid+1;
          int lc=fo-l;
          int rc=r-so;
          if(lc%2==0) l=so+1;
          else r=fo-1;
        }
         return ans;
    }
}