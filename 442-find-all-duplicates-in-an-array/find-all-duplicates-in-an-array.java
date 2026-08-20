class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer>ans=new ArrayList<>();
        int a=0;int b=0;
        while(b<n){
            if(nums[a]==nums[b]) b++;
            else{
                int idx=b-a;
                if(idx==2){
                 ans.add(nums[a]);
                }
                 a=b;
            }
        }
                int idx=b-a;
                if(idx==2){
                  ans.add(nums[a]);
                }
                int result[]=new int[ans.size()];
                for(int i=0;i<result.length;i++){
                    result[i]=ans.get(i);
                }
                return ans;
    }
}