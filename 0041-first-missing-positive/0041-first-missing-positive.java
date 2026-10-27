class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int range = 1;
        Set<Integer> contain = new HashSet<>();
        for(int num : nums){
            contain.add(num);
        }
        while(range<=nums.length+1){
            if(contain.contains(range)) range ++;
            else return range;
        }
        return range + 1;
    }
}