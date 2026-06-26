class Solution {
    public boolean isPerfectSquare(int num) {
        long low=0;
        long high=num;
        long ans=1;
        while(low<=high){
            long mid =low+ (high-low)/2;
            if(mid*mid<=num){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(ans*ans==num)return true;
        return false;
    }
}