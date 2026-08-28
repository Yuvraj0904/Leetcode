class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = -1;
        for (int k = 0; k < n; k++) {
            if (nums[k] >= 0) {
                j = k;
                break;
            }
        }
        int i;
        if (j == -1) {
            i = n - 1;
            j = n;
        } else {
            i = j - 1;
        }
        int ind = 0;
        while (i >= 0 && j < n) {
            if (Math.abs(nums[i]) <= nums[j]) {
                ans[ind++] = nums[i] * nums[i];
                i--;
            } else {
                ans[ind++] = nums[j] * nums[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[ind++] = nums[i] * nums[i];
            i--;
        }
        while (j < n) {
            ans[ind++] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }
}