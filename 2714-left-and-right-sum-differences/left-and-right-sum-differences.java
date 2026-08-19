class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int lt[]=new int[n];
        lt[0]=0;
        for(int i=1;i<n;i++){
            lt[i]=lt[i-1]+nums[i-1];
        }
        int rt[]=new int [n];
        rt[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rt[i]=rt[i+1]+nums[i+1];
        }
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(lt[i]-rt[i]);                
        }
        return ans;
    }
}