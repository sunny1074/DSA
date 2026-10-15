class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int i=0;

        while( i <= n){
            ans[i] = ans[i >> 1] + ( i & 1);
            i++;
        }

        return ans;
    }
}