class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n > s.length()) {
            return ans;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < n; i++) {
            arr1[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            arr2[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arr1, arr2)) {
            ans.add(0);
        }
        for (int i = n; i < s.length(); i++) {
            arr2[s.charAt(i) - 'a']++;
            arr2[s.charAt(i - n) - 'a']--;
            if (Arrays.equals(arr1, arr2)) {
                ans.add(i - n + 1);
            }
        }
        return ans; 
    }
}