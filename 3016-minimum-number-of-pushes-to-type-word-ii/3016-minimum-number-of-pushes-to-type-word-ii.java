class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int freq[] = new int[26];

        for (int i = 0; i < n; i++) {
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);

        int pushes = 0;
        int index = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            pushes += ((index / 8) + 1) * freq[i];
            index++;
        }

        return pushes;
    }
}