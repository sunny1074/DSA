class Solution {
    public int[] productExceptSelf(int[] nums) {
		return product(nums);
	}
	
	public int[] product(int[] arr) {
		int[] leftProduct = new int[arr.length];
		int[] rightProduct = new int[arr.length];
		
		leftProduct[0] = 1;
		for(int i = 1; i < arr.length; i++) {
			leftProduct[i] = leftProduct[i-1] * arr[i-1];
		}
		
		rightProduct[arr.length-1] = 1;
		for(int i = arr.length-2; i >= 0; i--) {
			rightProduct[i] = rightProduct[i+1] * arr[i+1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = leftProduct[i] * rightProduct[i];
		}
        return arr;
	 
    }
}