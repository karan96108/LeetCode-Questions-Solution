class Solution {
    public int reverse(int x) {
        // if(x>Integer.MAX_VALUE/10 || x<Integer.MIN_VALUE/10){
        //     return x;
        // }
        int temp = x;
        long res =0;
        while(temp != 0){
            int rem = temp%10;
            res = (10*res)+ rem;
            temp = temp/10;

        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
            return 0;
        }

        return (int)res;
    }
}