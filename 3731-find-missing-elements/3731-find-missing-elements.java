class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
        int previous=nums[0];
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int gap=current-previous;
            if(gap>0){
                for(int j=previous+1;j<current;j++){
                    ans.add(j);
                }
            }
            previous=current;
        }
        return ans;
    }
}