class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
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
        for(int x :nums){
            if(map.get(x)==1){
                return x;
            }
        }
        return -1;
    }
}