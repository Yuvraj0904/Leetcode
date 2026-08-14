class Solution {

    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        int i = 0;
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.get(ch) > 2) {
                char left = s.charAt(i);

                freq.put(left, freq.get(left) - 1);

                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
