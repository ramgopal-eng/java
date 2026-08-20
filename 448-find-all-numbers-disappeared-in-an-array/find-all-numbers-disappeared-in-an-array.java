class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();
        int frq[]=new int [n];
        for(int i=0;i<n;i++){
            frq[nums[i]-1]++;
        }
        for(int i=0;i<n;i++){
            if(frq[i]==0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}