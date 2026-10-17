class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
       int ans = 0;
       for(int i=0; i<nums.length; i++){
        ans = ans + nums[i];
        maxSum = Math.max(ans, maxSum);
        if(ans < 0){
            ans = 0;
        }
       }
       return maxSum;
    }
}