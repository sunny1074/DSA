class Solution {
    public int arraySign(int[] nums) {
        int count = 1;

        for( int i=0; i<nums.length; i++){
            if(nums[i] == 0) return 0;
            if(nums[i] < 0) count *= -1;
        }
        if(count >= 0) return 1;
        return -1;
    }
}