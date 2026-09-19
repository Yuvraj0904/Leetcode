class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int ansArr[] = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            ansArr[k] = ans.get(k);
        }
        return ansArr;
    }
}
