class Solution {
    public boolean isHappy(int n) {
        //if(n < 10 && n != 1) return false;
        int fast = helper(n);
        int slow = n;

        while(fast !=1 && fast != slow){
            slow = helper(slow);
            fast = helper(helper(fast));
        }
        if(fast == 1) return true;
        return false;
    }
    public int helper(int n){
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum += digits * digits;
            n = n/10;
        }
        return sum;
    }
}