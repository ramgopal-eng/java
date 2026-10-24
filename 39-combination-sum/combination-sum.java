class Solution {
    public List<List<Integer>> combinationSum(int[] coins, int amount) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
       combination(coins,amount,ll,0,ans);
       return ans;
    }
    static void combination(int coins[],int amount, List<Integer> ll,int idx, List<List<Integer>>ans) {
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if (amount >= coins[i]) {
                ll.add(coins[i]);
               combination(coins, amount - coins[i],ll,i,ans);
               //backtrack
               ll.remove(ll.size()-1);
            }
        }
    }
}