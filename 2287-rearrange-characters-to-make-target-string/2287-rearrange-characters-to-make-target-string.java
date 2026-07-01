class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqS.put(ch, freqS.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < target.length(); i++) {
            char ch = target.charAt(i);
            freqT.put(ch, freqT.getOrDefault(ch, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : freqT.entrySet()) {
            char ch = entry.getKey();
            int needed = entry.getValue();
            int available = freqS.getOrDefault(ch, 0);
            ans = Math.min(ans, available / needed);
        }
        return ans;
    }
}