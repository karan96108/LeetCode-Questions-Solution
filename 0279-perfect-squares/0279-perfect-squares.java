class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        int c =1;
        dp[0] =0;
        while(c*c <= n){
            int sq = c*c;
            for(int i = sq ;i<=n;i++){
                dp[i] = Math.min(dp[i-sq]+1, dp[i]);

            }
            c++;
        }
        return dp[n];
    }
}