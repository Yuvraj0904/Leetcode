class Solution {
    long  check(int []candies,int pile){
        long  cnt=0;
        for(int c:candies){
             cnt += (long )c / pile;
        }
        return cnt;
    }
    int maxInarr(int []candies){
        int maxi=Integer.MIN_VALUE;
        for(int c:candies){
            maxi=Math.max(c,maxi);
        }
        return maxi;
    }
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=maxInarr(candies);
        int ans= high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long  maxPilesDistributed=check(candies,mid);
            if(maxPilesDistributed>=k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(ans==high)return ans;
        return 0;
    }
}