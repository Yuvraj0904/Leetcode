class Solution {
    public int countElements(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int cnt=0;
        for(int el:nums){
            maxi=Math.max(maxi,el);
            mini=Math.min(mini,el);
        }
        for(int el:nums){
            if(el<maxi && el> mini){
                cnt++;
            }
        }
        return cnt;
    }
}