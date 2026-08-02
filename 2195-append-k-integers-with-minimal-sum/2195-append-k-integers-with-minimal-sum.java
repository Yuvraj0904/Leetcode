class Solution {

    public long minimalKSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int previous = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (previous == nums[i]) {
                continue;
            }
            int gap = nums[i] - previous - 1;
            int take = Math.min(gap, k);
            if (take > 0) {
                int first = previous + 1;
                int last = previous + take;
                sum += (long) (first + last) * take / 2;
                k -= take;
            }
            previous = nums[i];
            if (k == 0) {
                break;
            }
        }
        if (k > 0) {
            int first = previous + 1;
            int last = previous + k;
            sum += (long) (first + last) * k / 2;
        }
        return sum;
    }
}
