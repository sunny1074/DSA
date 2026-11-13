class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[101][101];
        dp[0][0] = poured;
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                double excess = dp[r][c] - 1;
                if (excess > 0) {
                    dp[r + 1][c] += excess / 2;
                    dp[r + 1][c + 1] += excess / 2;
                }
            }
        }
        return Math.min(1.0, dp[query_row][query_glass]);
    }
}