class Solution {
    public int helper(int[] arr, int currIndex, int[] dp){
        // Base case
        if(currIndex>=arr.length) return 0;
        if(dp[currIndex] != -1) return dp[currIndex];
        // condition 
        int ans1 = arr[currIndex] + helper(arr, currIndex+2, dp);

        int ans2 = helper(arr, currIndex + 1,dp);

        return dp[currIndex] = Math.max(ans1, ans2);
    }
    public int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n+1];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        return helper(nums, 0, dp);
    }
    
}