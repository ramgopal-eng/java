class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n=arr.length;
        boolean ans=false;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(map.containsKey(val)){
                int x=map.get(val);
                map.put(val,x+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(int x:arr){
            int k=map.get(x);
            if(k>1) ans= true;
            
        }
        return ans;
    }
}