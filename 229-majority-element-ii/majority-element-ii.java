class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                int frq=map.get(x);
                map.put(x,frq+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int x:map.keySet()){
            if(map.get(x)>n/3){
               ans.add(x);
            }
        }
        return ans;
    }
}