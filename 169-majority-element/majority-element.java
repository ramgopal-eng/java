class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int i=0;int j=0;
        int maxfrq=-1;
        int ans=0;
        while(j<n){
            if(nums[i]==nums[j]) j++;
            else{
                int frq=j-i;
               if(frq>maxfrq){
                maxfrq=frq;
                    ans=nums[i];
               }
               i=j;
            }
           
        }int frq=j-i;
         if(frq>maxfrq){
                maxfrq=frq;
                    ans=nums[i];
               }
        return ans;
    }
}