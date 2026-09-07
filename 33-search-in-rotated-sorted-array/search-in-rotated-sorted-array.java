class Solution {
    public int search(int[] nums, int x) {
      int n=nums.length;
      int lo=0;
      int hi=n-1;
      while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==x){
            return mid;
        }
       if(nums[lo]<=nums[mid]){
        if(nums[lo]<=x && nums[mid]>x){
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
       }
       else{
        if(nums[mid]<x && nums[hi]>=x){
            lo=mid+1;
        }
        else{
            hi=mid-1;
        }
       }

      }
      return -1;

    }
}