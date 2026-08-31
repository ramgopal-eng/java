class Solution {
    public int[] twoSum(int[] arr, int x) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int i=0;int j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(lo<hi){
           if(arr[lo]+arr[hi]==x){
           return new int[]{lo+1,hi+1};
           
           }
           else if(arr[lo]+arr[hi]>x){
            hi--;
           }
           else {
            lo++;
           }
        }
       return new int[]{};
    }
}