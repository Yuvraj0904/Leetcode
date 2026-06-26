class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j= (long)Math.sqrt(c);
        while(i<=j){
            long val=(i*i)+(j*j);
            if(val==c){
                return true;
            }
            else if(val<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}