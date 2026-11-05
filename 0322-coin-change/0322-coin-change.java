class Solution {
    public long change(int[] arr, long k, int target, int currIndex, long[][] dp){
        //Base case
        if(target == k) return 0;
        if(currIndex>=arr.length) return 10000000;
        if(k>target) return 100000000;
        if(dp[currIndex][(int)k] != (int)-1) return dp[currIndex][(int)k];


        //Calculation
        long ans1 = 1 + change(arr, k+arr[currIndex], target, currIndex, dp);

        long ans2 = change(arr, k, target, currIndex + 1, dp);

        return dp[currIndex][(int)k] = Math.min(ans1, ans2);

    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount];
        for(int i=0;i<n;i++) for(int j=0;j<amount;j++) dp[i][j] = -1;
        long ans = change(coins, 0, amount, 0, dp);
        if(ans>10000) return -1;
        return (int)ans;
    }
}
