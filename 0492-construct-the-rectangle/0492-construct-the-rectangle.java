class Solution {
    public int[] constructRectangle(int area) {
        int w = area;
        while(w!=1){
            int l = area/w;
            if(l*w == area && l>=w) return new int[]{l, w};
            else{
                w--;
            }
        }
        return new int[]{area, 1};
    }
}