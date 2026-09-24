class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer>map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
     for (int i = 0;i< s.length();i++) {
            char ch = s.charAt(i);
       if (map.containsKey(ch) && map.get(ch)>=left){
                left = map.get(ch)+1;
         }
         map.put(ch,i);
         maxLength=Math.max(maxLength,i-left+1);
     }
     return maxLength;
    }
}