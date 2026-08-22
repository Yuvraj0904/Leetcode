class Solution {
    public int digitSum(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n=n/10;
        }
        return sum;
    }
    public int digitProduct(int n){
        int product=1;
        while(n>0){
            int lastDigit=n%10;
            product=product*lastDigit;
            n=n/10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
        int x=digitSum(n);
        int y=digitProduct(n);
        return n%(x+y)==0?true:false;

    }
}