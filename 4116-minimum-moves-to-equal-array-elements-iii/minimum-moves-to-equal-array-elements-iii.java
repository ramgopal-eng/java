class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            sum+=nums[i];
        }
        int ans=n*max-sum;
       
       return ans; 
    }
}