class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        int maxLength = 1;
        int ones = mpp.getOrDefault(1, 0);

        if (ones > 0) {
            maxLength = Math.max(
                maxLength,
                (ones % 2 == 0) ? ones - 1 : ones
            );
        }

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {

            long current = entry.getKey();
            if (current == 1 || entry.getValue() < 2) {
                continue;
            }

            int length = 1;

            while (true) {

                long next = current * current;

                if (next > 1_000_000_000L) {
                    break;
                }

                int freq = mpp.getOrDefault((int) next, 0);

                if (freq >= 2) {
                    length += 2;
                    current = next;

                } else if (freq == 1) {
                    length += 2;
                    break;

                } else {
                    break;
                }
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}