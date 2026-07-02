class Solution {
    int helper (int [] nums){
        int low=0;
        int high=0;
        int maxLen=0;
        while(high<nums.length ){
            int start=low;
            int mask = 0;
            boolean possible = true;
            for(int i= start;i<=high;i++){
                if((mask & nums[i])!=0){
                    possible=false;
                    break;
                }
                mask|=nums[i];
            }
                if(!possible){
                    low++;
                }
            maxLen=Math.max(maxLen,high-low+1);
          high++;
    }
    return maxLen;
    }
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 1;
        }
        return helper(nums);
    }
}