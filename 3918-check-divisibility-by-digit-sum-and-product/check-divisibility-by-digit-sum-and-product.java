class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int p=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        int pro=1;
        while(p>0){
            int rem=p%10;
             pro=pro*rem;
             p/=10;
        }
        if(k%(sum+pro)==0){
            return true;
        }
       return false;
    }
}