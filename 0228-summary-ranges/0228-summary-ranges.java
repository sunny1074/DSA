class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int num1 = nums[i];
            int num2 = nums[i];
            int j = i+1;
            while(j<nums.length && nums[j]-nums[i]==1){
                num2++;
                j++;
                i++;
            }

            if(num1 == num2){
                ans.add(""+nums[i]);
                i++;
            }else{
                ans.add(""+num1+"->"+num2);
                i=j;
            }
        }

        return ans;
    }
}