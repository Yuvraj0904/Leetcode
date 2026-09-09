class Solution {

    public int[] shortestToChar(String s, char c) {

        int[] res = new int[s.length()];
        Arrays.fill(res, Integer.MAX_VALUE);

        int lastSeen = -1;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                lastSeen = i;
                res[i] = 0;
            } 
            else if (lastSeen != -1) {
                res[i] = i - lastSeen;
            }
        }

        lastSeen = -1;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                lastSeen = i;
            } 
            else if (lastSeen != -1) {
                res[i] = Math.min(res[i], lastSeen - i);
            }
        }

        return res;
    }
}