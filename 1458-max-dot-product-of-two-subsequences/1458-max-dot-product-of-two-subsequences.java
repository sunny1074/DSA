class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++) for(int j=0; j<n; j++) dp[i][j] = -1;
        return helper(0, 0, nums1, nums2, dp);
    }
    public int helper(int i, int j, int[] nums1, int[] nums2, int[][] dp){
        if(i == nums1.length){
            if(j == 0){
                return -1000000000;
            }
            return 0;
        }
        if(j == nums2.length){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];

        }
        int skip = helper(i+1, j, nums1, nums2, dp);
        int pick = -1000000000;
        for(int k=j; k<nums2.length; k++){
            pick = Math.max(pick, nums1[i]*nums2[k] + helper(i+1, k+1, nums1, nums2, dp));
        }
        return dp[i][j] = Math.max(pick, skip);
    }
}