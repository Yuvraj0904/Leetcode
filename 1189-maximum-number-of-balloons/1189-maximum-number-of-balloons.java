class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ("balloon".indexOf(ch) != -1) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        int b = freq.getOrDefault('b', 0);
        int a = freq.getOrDefault('a', 0);
        int l = freq.getOrDefault('l', 0) / 2;
        int o = freq.getOrDefault('o', 0) / 2;
        int n = freq.getOrDefault('n', 0);
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}