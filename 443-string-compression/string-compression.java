class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        String s="";
       int i=0; int j=0;
       while(j<n){
           if(chars[i]==chars[j]) j++;
           else{
            int frq=j-i;
               s+=(chars[i]);
               if(frq>1) s+=frq; 
              i=j;
           }

       }
             int frq=j-i;
               s+=(chars[i]);
               if(frq>1) s+=frq; 
         for(int k=0;k<s.length();k++){
            chars[k]=s.charAt(k);
         }
       return s.length();
    }
}