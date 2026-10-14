class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();

        while(n != 0){
            sb.append(n%2);
            n = n/2;
        }
        int count = 0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '1') count++;
        }
        return count;
    }
}