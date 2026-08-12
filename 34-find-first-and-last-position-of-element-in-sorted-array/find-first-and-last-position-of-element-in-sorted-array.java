class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int k=n;
       
        int idx=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        int a=0;int b=n-1;
        while(a<=b){
            int mid=(a+b)/2;
            if(nums[mid]>target)b=mid-1;
            else if(nums[mid]<target)a=mid+1;
            else {
               idx=mid;
                b=mid-1;  
            }
        }
        ans.add(idx);
         int c=0;
         int d=k-1;
         idx=-1;
         while(c<=d){
            int mid=(c+d)/2;
            if(nums[mid]>target)d=mid-1;
            else if(nums[mid]<target)c=mid+1;
            else {
               idx=mid;
                c=mid+1;
                
            }
        }
        ans.add(idx);
            int arr[]=new int [ans.size()];
            for(int i=0;i<arr.length;i++){
                arr[i]=ans.get(i);
            }
            return arr;
    }
}