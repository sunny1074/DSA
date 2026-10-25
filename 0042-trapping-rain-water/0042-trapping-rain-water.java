class Solution {
    public int trap(int[] height) {
		return trappingWater2(height);
	}
	
	public static int trappingWater2(int[] arr) {
		int len = arr.length;
		int[] leftMax = new int[len];
		int[] rightMax = new int[len];
		
		leftMax[0] = arr[0];
		for(int i = 1; i < len; i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}
		
		rightMax[len-1] = arr[len-1];
		for(int i = len-2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i+1], arr[i]);
		}
		
		int ans = 0;
		for(int i = 1; i < len-1; i++) {
			int minHeight = Math.min(leftMax[i], rightMax[i]);
			int val = minHeight - arr[i];
			ans += val;
		}
		
		return ans;
	}
	
	public static int trappingWater(int[] arr) {
		int ans = 0;
		for(int i = 1; i < arr.length-1; i++) {
			int leftMax = findMax(arr, 0, i); 
			int rightMax = findMax(arr, i, arr.length-1);
			int minHeight = Math.min(leftMax, rightMax);
			ans = ans + (minHeight - arr[i]);
		}
		
		return ans;
	}
	
	public static  int findMax(int[] arr, int start, int end) {
		int max = arr[start];
		for(int i = start; i <= end; i++) {
			max = Math.max(max, arr[i]);
		}
		
		return max;  
    }
}