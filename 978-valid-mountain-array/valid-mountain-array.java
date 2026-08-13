class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int l=1;
        int idx=-1;
        int h=n-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                idx=mid ;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])l=mid+1;
            else h=mid-1;

        }
        if(idx==-1)return false;
        for(int i=1;i<=idx;i++){
            if(arr[i]<=arr[i-1]) return false;
        }
        for(int i=idx+1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }
      return true;
    }
}