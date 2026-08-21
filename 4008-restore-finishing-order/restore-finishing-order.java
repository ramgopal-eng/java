class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=order.length;
        int m=friends.length;
        int k=0;
        int ans[]=new int [m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(order[i]==friends[j]){
                    ans[k]=order[i];
                    k++;
                }
            }
        }
        return ans;
    }
}