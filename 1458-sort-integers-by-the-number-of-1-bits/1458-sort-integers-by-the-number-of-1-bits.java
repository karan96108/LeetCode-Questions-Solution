class Solution {
    // public boolean powerof2(int n){
    //     if(n<0){
    //         return false;
    //     }

    //     return (n & (n-1))== 0;

    // }
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            for(int j =0;j<n-1;j++){
                if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
            return arr;
    }
}