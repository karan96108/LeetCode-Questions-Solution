class Solution {
    public int climb(int n, int[] dp ){
         if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != 0) return dp[n];
        int one = climb(n-1,dp);
        int two = climb(n-2,dp);
        return dp[n] = one + two;
    }
    public int climbStairs(int n) {
       int[] dp = new int[n+1];
       return climb(n,dp);
    }
}