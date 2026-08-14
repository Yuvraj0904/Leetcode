class Solution {
    public int maximumDifference(int[] nums) {
        int diff=0;
        int prev=nums[0];
        for(int i=0;i<nums.length;i++){
            int value=nums[i]-prev;
            diff=Math.max(diff,value);
            prev=Math.min(nums[i],prev);
        }
        return diff<=0?-1:diff;
    }
}