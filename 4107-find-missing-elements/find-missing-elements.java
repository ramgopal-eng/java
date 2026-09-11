class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int lo=nums[0];
        int hi=nums[n-1];
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>has=new HashSet<>();
        for(int i=0;i<n;i++){
          has.add(nums[i]);
        }
        for(int i=lo;i<hi;i++){
            if(has.contains(i)==false) ans.add(i);
        }
        return ans;
    }
}