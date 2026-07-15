class Solution {
    int findGcd(int a,int b){
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0;
        int sumOdd=0;
       for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1);
            sumEven += (2 * i);
        }

        return findGcd(sumEven,sumOdd);
    }
}