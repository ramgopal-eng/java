class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int corrno=mid+1;
            int missno=arr[mid]-corrno;
            if(missno>=k) hi=mid-1;
            else lo=mid+1;
        }
        return lo+k;
    }
}