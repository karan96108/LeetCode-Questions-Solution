class Solution {
        // Hashset<Integer> set = new HashSet<>();
    public int choose(int[] nums , int i,int[] dp){
        if(i>= nums.length){
            return 0;
        }

        if(dp[i] != 0) return dp[i];

        int currvalue = nums[i];
        int currsum = nums[i];

        int index = i +1;

        while(index < nums.length && nums[index] == currvalue){
            currsum+= nums[i];

            index++;
        }
        
        while(index < nums.length && nums[index] == currvalue+1){
            // currsum+= arr[i];

            index++;
        }
        
        return dp[i]= Math.max(currsum+choose(nums,index,dp),choose(nums,i+1,dp));

        
    }
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.sort(nums);

        return choose(nums,0,dp);
    }
}