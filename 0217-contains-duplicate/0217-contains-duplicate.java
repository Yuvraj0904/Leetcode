class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int ele : nums) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }
}