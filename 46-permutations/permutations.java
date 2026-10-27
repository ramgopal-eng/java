class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        permutation(nums,ll,ans);
        return ans;
    }
    public static void permutation(int nums[],List<Integer>ll,List<List<Integer>>ans){
        if (ll.size() == nums.length) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
             if (ll.contains(nums[i])) {
                continue;
            }
            ll.add(nums[i]);
            permutation(nums,ll,ans);
            ll.remove(ll.size()-1);
        }
        
    }
}