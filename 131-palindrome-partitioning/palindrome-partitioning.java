class Solution {
    public List<List<String>> partition(String que) {
        List<String>ll=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        partion(que,ll,ans);
        return ans;
    }
    static void partion(String que, List<String>ll,List<List<String>>ans) {
        if(que.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=que.length();i++){
            String s=que.substring(0,i);
            if(ispallindrome(s)){ 
                ll.add(s);
            partion(que.substring(i),ll,ans);
            ll.remove(ll.size()-1);
            }
        }
    }
    static boolean ispallindrome(String s) {
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}