class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalsum = 0;
        for(int i=0; i<arr.length; i++){
            totalsum += arr[i];
        }

        if(totalsum%3 != 0) return false;

        totalsum = totalsum/3;
        int sum = 0;
        int count = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(sum == totalsum){
                sum = 0;
                count++;
            }
        }
        return count >= 3;
    }
}