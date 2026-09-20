class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int x=26-(ch-'a');
            int idx=i+1;
            ans+=x*idx;
        }
        return ans;
    }
}