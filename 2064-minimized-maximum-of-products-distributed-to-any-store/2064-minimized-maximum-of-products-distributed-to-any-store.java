class Solution {

    int maxInarr(int[] quantities) {
        int maxi = Integer.MIN_VALUE;

        for (int q : quantities) {
            maxi = Math.max(maxi, q);
        }

        return maxi;
    }

    boolean canDistribute(int[] quantities, int mid, int n) {
        int storesNeeded = 0;

        for (int q : quantities) {
            storesNeeded += (q + mid - 1) / mid;
        }

        return storesNeeded <= n;
    }

    public int minimizedMaximum(int n, int[] quantities) {

        int low = 1;
        int high = maxInarr(quantities);
        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canDistribute(quantities, mid, n)) {
                ans = mid;        
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }

        return ans;
    }
}