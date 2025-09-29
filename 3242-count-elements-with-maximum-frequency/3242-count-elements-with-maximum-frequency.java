class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        int n = nums.length;

        for(int i =0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        int maxfreq = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            maxfreq = Math.max(maxfreq, entry.getValue());

        }
        int c =0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(maxfreq == entry.getValue()){
                c+= maxfreq;
            }


        }
        return c;


    }
}