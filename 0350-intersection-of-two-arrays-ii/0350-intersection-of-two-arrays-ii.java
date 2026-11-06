class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int num : nums1){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                ans.add(nums2[i]);
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
            }
        }
        int[] arr = new int[ans.size()];
        for(int j=0; j<ans.size(); j++){
            arr[j] = ans.get(j);
        }
        return arr;
    }
}