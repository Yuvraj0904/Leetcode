class Solution {
    public boolean isHappy(int n) {
        while (n > 9) {
            int temp = n;
            int sum = 0;
            while (temp > 0) {
                int last = temp % 10;
                sum += last * last;
                temp = temp / 10;
            }
            n = sum;
        }
         if (n < 9) {
                if (n == 1 || n == 7)
                    return true;
            }
        return false;
    }
}