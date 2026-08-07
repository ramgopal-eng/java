class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                nums[i]=1;
            }
            else{
                nums[i]=0;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}