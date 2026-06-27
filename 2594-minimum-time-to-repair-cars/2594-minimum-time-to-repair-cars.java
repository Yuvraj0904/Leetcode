class Solution {

    long carsRepaired(int[] ranks, long time) {
        long totalCars = 0;
        for (int r : ranks) {
            totalCars += (long) Math.sqrt((double) time / r);
        }
        return totalCars;
    }

    public long repairCars(int[] ranks, int cars) {

        long low = 1;
        long maxRank = 0;
        for (int r : ranks) {
            maxRank = Math.max(maxRank, r);
        }

        long high = maxRank * (long) cars * cars;
        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (carsRepaired(ranks, mid) >= cars) {
                ans = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return ans;
    }
}