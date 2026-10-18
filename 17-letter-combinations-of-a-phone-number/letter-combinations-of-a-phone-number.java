class Solution {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String que) {
        List<String>ll=new ArrayList<>();
         pp(que,"",ll);
         return ll;
    }
    static void pp(String que,String ans,List<String>ll) {
        if(que.length()==0){
            ll.add(ans);
            return;
        }
        char ch=que.charAt(0);
        int num=ch-'0';
        String press=map[num];
        for(int i=0;i<press.length();i++){
            pp(que.substring(1),ans+press.charAt(i),ll);
        }
    }
}