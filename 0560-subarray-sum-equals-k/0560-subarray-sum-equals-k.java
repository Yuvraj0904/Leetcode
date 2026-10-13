class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp= new HashMap<>();
        mpp.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int remove=sum-k;
            if(mpp.containsKey(remove)){
                cnt+=mpp.get(remove);
            }
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);

        }
        return cnt;
    }
}