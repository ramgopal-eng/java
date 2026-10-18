class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ll=new ArrayList<>();
         gp(n,0,0,"",ll);
         return ll;
    }
     static void gp(int n,int op,int cl,String ans,List<String>ll) {
        if (n == op && n == cl) {
            ll.add(ans);
            return;
        }
        if (op< n){
            gp(n, op + 1, cl, ans + "(",ll);
    }
        if(cl<op) {
            gp(n, op, cl + 1, ans + ")",ll);
        }
    }
}