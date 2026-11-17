class Solution {
    public boolean isMonotonic(int[] nums) {
        return (incre(nums) || decre(nums));
    }
    public boolean incre(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean decre(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }
}