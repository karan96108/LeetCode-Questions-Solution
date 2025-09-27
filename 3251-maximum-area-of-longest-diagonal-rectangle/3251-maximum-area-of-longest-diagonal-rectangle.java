class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int maxArea = 0;
        double maxDiag = 0;
        int n = arr.length;
        for(int i =0 ;i<n;i++){
            int l = arr[i][0];
            int w = arr[i][1];
            // diamax = Math.max(Math.sqrt(l*l + w*w) , diamax);
 double diag = Math.sqrt((long) l * l + (long) w * w);

            if (diag > maxDiag) {
                maxDiag = diag;
                maxArea = l * w;
            } else if (diag == maxDiag) {  
                maxArea = Math.max(maxArea, l * w);        }
        }
        return maxArea;



        
    }
}