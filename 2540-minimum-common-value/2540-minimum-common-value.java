class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int min=Integer.MAX_VALUE;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
               min=Math.min(min,nums1[i]);
               i++;
               j++;
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}