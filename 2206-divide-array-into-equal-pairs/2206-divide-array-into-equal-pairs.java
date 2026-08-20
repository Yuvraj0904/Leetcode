class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int value = entry.getValue();
            if (value % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
