class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        int sum = 0;
        for(int i=0; i<n-1; i++){
            int curr = timeSeries[i+1] - timeSeries[i];
            if(curr < duration){
                sum += curr;
            }else{
                sum += duration;
            }
        }
        return sum + duration;
    }
}