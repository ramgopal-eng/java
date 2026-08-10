class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0; int j=0; 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         ArrayList<Integer>ans=new ArrayList<>();
         while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;j++;
            
            while (i < n && nums1[i] == nums1[i - 1]) {
                    i++;
                }
            while (j < m && nums2[j] == nums2[j - 1]) {
                    j++;
                }
            }
            else if (nums1[i]>nums2[j]) j++;
            else if (nums1[i]<nums2[j]) i++;
         }
         int result[]=new int[ans.size()];
         for(int k=0;k<result.length;k++){
            result[k]=ans.get(k);
         }
         return result;
    }
}