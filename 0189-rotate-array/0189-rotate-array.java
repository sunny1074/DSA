class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       int[] arr = new int[n];
       int j=0; 
       for(int i=n-k;i<n;i++){
        arr[j] = nums[i];
        j++;
       }
       for(int l=0; l<(n-k); l++){
        arr[j] = nums[l];
        j++;
       }
       for(int a=0; a<n; a++){
        nums[a]=arr[a];
       }
    }
}