class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int c=1;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(digits[i]+c<=9){
                ans.add(digits[i]+c);
                c=0;
            }
            else{
                ans.add(0);
                c=1;
            }
        }
        if(c==1) ans.add(1);
        Collections.reverse(ans);
        int result[]=new int [ans.size()];
     for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
           }
        return result;
    }
}