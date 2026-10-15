class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxSum = 0;
        int currSum = 0;
        while (r < nums.length) {
            currSum += nums[r];
            if (mpp.containsKey(nums[r])) {
                int newL = mpp.get(nums[r]) + 1;
                while (l < newL) {
                    currSum -= nums[l];
                    l++;
                }
            }
            maxSum = Math.max(maxSum, currSum);
            mpp.put(nums[r], r);
            r++;
        }
        return maxSum;
    }
}