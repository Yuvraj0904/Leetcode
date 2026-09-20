class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = 26 - (ch - 'a');
            res += value * (i + 1);
        }
        return res;
    }
}