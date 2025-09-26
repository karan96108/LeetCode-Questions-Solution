class Solution {
    public int digitsum(int n){
        int sum = 0;
        int temp = n;
        while(temp >0){
            int rem = temp%10;
            sum += Math.pow(rem,2);

            temp = temp/10;
        }

        return sum;
    }
        HashSet<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        return isHappy(digitsum(n));

    }
}