class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int c =-1;
        int n = nums.size();
        for(int i =0;i<n;i++){
            
            if(nums.get(i) > nums.get((i+1)%n)){
                if(c != -1) return -1;
                c = i;
            }
            // c++;
        }
        return c == -1 ? 0 : n-c-1;
    }
}