class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int ele : nums) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(mpp.keySet());

        list.sort((a, b) -> mpp.get(b) - mpp.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
