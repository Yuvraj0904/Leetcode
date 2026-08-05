class Solution {

    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while (n > 0) {
            int last = n % 10;
            n = n / 10;

            if (last > max1) {
                max2 = max1;
                max1 = last;
            } else if (last > max2) {
                max2 = last;
            }
        }

        return max1 * max2;
    }
}
