class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                ans.add(nums[i]);
            }
        }
            for(int k=0;k<ans.size();k++){
                nums[k]=ans.get(k);
            }
            return ans.size();
    }
}