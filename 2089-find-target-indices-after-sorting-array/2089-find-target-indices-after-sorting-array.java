class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       Arrays.sort(nums);
       int n = nums.length;
       List<Integer> ans= new ArrayList<>();
       for(int i=0;i<n;i++){
        if(target== nums[i]){
            ans.add(i);
        }
       } 
       return ans;
    }
}