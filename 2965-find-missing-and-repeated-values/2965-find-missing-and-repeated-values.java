class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long sn1 = (long) N * (N + 1) / 2;
        long sn2 = (long) N * (N + 1) * (2 * N + 1) / 6;

        long s1 = 0;
        long s2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s1 += grid[i][j];
                s2 += (long) grid[i][j] * grid[i][j];
            }
        }

        long val1 = s1 - sn1;       // x - y
        long val2 = s2 - sn2;       // x² - y²

        val2 = val2 / val1;       

        int x = (int) ((val1 + val2) / 2); 
        int y = (int) (x - val1);        

        return new int[]{x, y};
    }
}