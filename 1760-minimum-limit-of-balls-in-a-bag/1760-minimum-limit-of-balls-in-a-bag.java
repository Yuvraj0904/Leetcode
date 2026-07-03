class Solution {

    int maxi(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }
        return maxi;
    }

    long divide(int mid, int[] nums) {
        long operations = 0;

        for (int num : nums) {
            operations += (long)(num - 1) / mid;
        }

        return operations;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = maxi(nums);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long opsNeeded = divide(mid, nums);

            if (opsNeeded <= maxOperations) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}