class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> s = new HashMap<>();
      for(int i=0; i<nums.length; i++){
        int rem = target - nums[i];
        if(s.containsKey(rem)){
            return new int[]{i, s.get(rem)};
        }
        else{
            s.put(nums[i], i);
        }
      }
      return new int[]{111, 111};
    }
}
